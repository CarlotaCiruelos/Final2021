package com.example.icai.Final2021.Service.Impl;

import com.example.icai.Final2021.Model.Reservas;
import com.example.icai.Final2021.Respository.ReservasRepository;
import com.example.icai.Final2021.Service.ReservasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;

@Service
public class ReservasServiceImpl implements ReservasService {

    @Autowired
    ReservasRepository reservasRepository;

    @Override
   public Iterable<Reservas> getAllBookings(){
        return reservasRepository.findAll();
    }

    @Override
    public Optional<Reservas> getReservaById(int id){
    return reservasRepository.findById(id);
    }

    @Override
    public void deleteById(int id){
        reservasRepository.deleteById(id);
    }
}
