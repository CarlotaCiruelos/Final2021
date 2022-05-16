package com.example.icai.Final2021.Service;

import com.example.icai.Final2021.Model.Reservas;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ReservasService {
    Iterable<Reservas> getAllBookings();
    Optional<Reservas> getReservaById(int id);
    void deleteById(int id);
}
