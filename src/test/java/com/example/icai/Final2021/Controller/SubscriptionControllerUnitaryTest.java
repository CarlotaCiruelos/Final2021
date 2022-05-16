package com.example.icai.Final2021.Controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.http.RequestEntity.post;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest({SubscriptionController.class})
class SubscriptionControllerUnitaryTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void return_ok_when_post(){

        //Given
        SubscribeRequest request = new SubscribeRequest("carlota@gmail.com");


        try {
            this.mockMvc.perform(MockMvcRequestBuilders.post("/api/subscribe")
                            .contentType(APPLICATION_JSON_VALUE)
                            .content(asJsonString(request)))
                    .andDo(print())
                    .andExpect(status().isOk())
                    .andExpect((ResultMatcher) content().string("OK"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

   public static String asJsonString(Object obj) {
            try {
                return new ObjectMapper().writeValueAsString(obj);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }



}