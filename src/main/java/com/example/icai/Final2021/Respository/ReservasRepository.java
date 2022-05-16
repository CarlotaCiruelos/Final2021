package com.example.icai.Final2021.Respository;

import com.example.icai.Final2021.Model.Reservas;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservasRepository extends CrudRepository<Reservas, Integer> {

}
