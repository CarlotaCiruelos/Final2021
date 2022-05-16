package com.example.icai.Final2021.Respository;

import com.example.icai.Final2021.Model.Temperatures;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TemperatureRepository extends CrudRepository<Temperatures, Long> {
    @Query("SELECT AVG(VALUE) FROM TEMPERATURES WHERE YEAR=2021")
    float getTemperaturaMedia();
}
