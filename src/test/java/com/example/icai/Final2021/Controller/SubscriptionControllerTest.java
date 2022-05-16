package com.example.icai.Final2021.Controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;


import java.lang.reflect.Type;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class SubscriptionControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate testRestTemplate;


    //happyPath
    @Test
    void return_ok_when_postOk() {
        //given
        SubscribeRequest subscribeRequest = new SubscribeRequest("carlotaciruelos@gmail.com");
        String url = "http://localhost:" + Integer.toString(port) + "/api/subscribe";
        HttpHeaders headers = HttpHeaders.EMPTY;
        HttpEntity<SubscribeRequest> entity = new HttpEntity<>(subscribeRequest,headers);

        //when
        ResponseEntity<SubscribeResponse> result = testRestTemplate.exchange(url, HttpMethod.POST, entity, new ParameterizedTypeReference<SubscribeResponse>(){} );

        //then

        Assertions.assertEquals(result.getBody().getMessage(), "Ok");

    }

    //badPattern
    @Test
    void return_UNSUPPORTED_MEDIA_TYPE_when_invalidBody() {
        //given
        //SubscribeRequest subscribeRequest = new SubscribeRequest("carlotaciruelosgmail.com");
        String email = "carlotaciruelos@gmail.com";
        String url = "http://localhost:" + Integer.toString(port) + "/api/subscribe";
        HttpHeaders headers = HttpHeaders.EMPTY;
        HttpEntity<String> entity = new HttpEntity<>(email,headers);

        //when
        ResponseEntity<SubscribeResponse> result = testRestTemplate.exchange(url, HttpMethod.POST, entity, new ParameterizedTypeReference<SubscribeResponse>(){} );

        //then

        Assertions.assertEquals(HttpStatus.UNSUPPORTED_MEDIA_TYPE, result.getStatusCode());

    }

    //badPattern
    @Test
    void return_badRequest_when_invalidPattern() {
        //given
        SubscribeRequest subscribeRequest = new SubscribeRequest("carlotaciruelosgmail.com");
        String url = "http://localhost:" + Integer.toString(port) + "/api/subscribe";
        HttpHeaders headers = HttpHeaders.EMPTY;
        HttpEntity<SubscribeRequest> entity = new HttpEntity<>(subscribeRequest,headers);

        //when
        ResponseEntity<SubscribeResponse> result = testRestTemplate.exchange(url, HttpMethod.POST, entity, new ParameterizedTypeReference<SubscribeResponse>(){} );

        //then

        Assertions.assertEquals(HttpStatus.BAD_REQUEST, result.getStatusCode());

    }
}