package ru.plantEquipment.dataTransferObject;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import ru.plantEquipment.domain.Message;

import java.util.*;

public class RestObjectMapper {
    ObjectMapper objectMapper = new ObjectMapper();
    public String resultDtoToTransfer;

    public RestObjectMapper(Iterable<Message> messages) throws JsonProcessingException {
        for (Message equipmentUnit : messages){
            DtoData dtoData = new DtoData(equipmentUnit);
            List<DtoData> allEquipment = new ArrayList<>();
            allEquipment.add(dtoData);
            resultDtoToTransfer = objectMapper.writeValueAsString(allEquipment);
        }
    }

    public RestObjectMapper(Message message) throws JsonProcessingException {
        DtoData dtoData = new DtoData(message);
        resultDtoToTransfer = objectMapper.writeValueAsString(dtoData);
    }
}
