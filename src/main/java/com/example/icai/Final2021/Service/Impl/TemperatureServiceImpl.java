package com.example.icai.Final2021.Service.Impl;

import com.example.icai.Final2021.Respository.TemperatureRepository;
import com.example.icai.Final2021.Service.TemperatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TemperatureServiceImpl implements TemperatureService {

    @Autowired
    TemperatureRepository temperatureRepository;

    @Override
    public float getTemperaturaMedia(){
        return temperatureRepository.getTemperaturaMedia();
    }
}
