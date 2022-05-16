package com.example.icai.Final2021.Controller;

import com.example.icai.Final2021.Model.Reservas;
import com.example.icai.Final2021.Service.ReservasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v2")
public class ReservasController {
    @Autowired
    ReservasService reservasService;

    @GetMapping("/getAll")
    public ResponseEntity<Iterable<Reservas>> getAll(){
        return ResponseEntity.ok().body(reservasService.getAllBookings());
    }

    @GetMapping("/filter/{id}")
    public ResponseEntity<Optional<Reservas>> getById(@PathVariable("id") int id){
        return ResponseEntity.ok().body(reservasService.getReservaById(id));
    }
    @GetMapping("/delete/{id}")
    public void deleteById(@PathVariable("id") int id){
        reservasService.deleteById(id);
    }
}
