package com.example.icai.Final2021.Controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubscribeRequestTest {

    @Test
    void return_email_if_valid_pattern() {
        // Given
        SubscribeRequest subscribeRequest = new SubscribeRequest();

        //When
        subscribeRequest.setEmail("carlota@gmail.com");

        //Then
        Assertions.assertEquals(subscribeRequest.getEmail(),"carlota@gmail.com");

    }

}