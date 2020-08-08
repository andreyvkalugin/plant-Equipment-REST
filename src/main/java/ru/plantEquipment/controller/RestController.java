package ru.plantEquipment.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping(value = "/test")
    public String restMethod (String name) throws JsonProcessingException {
        RestObjectMapper result = new RestObjectMapper();
         return result.resultDtoToTransfer;
    }
}
