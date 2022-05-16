package com.example.icai.Final2021.Controller;

import ch.qos.logback.classic.Logger;
import com.example.icai.Final2021.Service.TemperatureService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1")
@RestController
public class TemperatureController {

    private static final Logger LOGGER = (Logger)
            LoggerFactory.getLogger(TemperatureController.class);
    @Autowired
    TemperatureService temperatureService;

    @GetMapping("/media")
    public float getTemperaturaMedia(){
        float r=temperatureService.getTemperaturaMedia();
        LOGGER.info(r+"");
        return temperatureService.getTemperaturaMedia();
    }
}
