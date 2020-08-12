package ru.plantEquipment.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.plantEquipment.dataTransferObject.RestObjectMapper;
import ru.plantEquipment.domain.Message;
import ru.plantEquipment.repos.MessageRepo;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/message")
public class RestController {
    @Autowired
    private MessageRepo messageRepo;

    @GetMapping
    public String restMethod (String name) throws JsonProcessingException {
        Iterable<Message> messages = messageRepo.findAll();
        RestObjectMapper result = new RestObjectMapper(messages);
         return result.resultDtoToTransfer;
    }

    @GetMapping("{message}")
    public String userEditForm(@PathVariable Message message) throws JsonProcessingException{
        RestObjectMapper result = new RestObjectMapper(message);
        return result.resultDtoToTransfer;
    }

}
