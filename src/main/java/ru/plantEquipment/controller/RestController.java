package ru.plantEquipment.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.plantEquipment.dataTransferObject.RestObjectMapper;
import ru.plantEquipment.domain.Message;
import ru.plantEquipment.domain.Role;
import ru.plantEquipment.domain.User;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/message")
public class RestController {

    @GetMapping(value = "/test")
    public String restMethod (String name) throws JsonProcessingException {
        RestObjectMapper result = new RestObjectMapper(null);
         return result.resultDtoToTransfer;
    }

    @GetMapping("{message}")
    public String userEditForm(@PathVariable Message message) throws JsonProcessingException{
        RestObjectMapper result = new RestObjectMapper(message);
        return result.resultDtoToTransfer;
    }

}
