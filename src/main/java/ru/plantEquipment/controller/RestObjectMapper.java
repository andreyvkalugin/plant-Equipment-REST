package ru.plantEquipment.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class RestObjectMapper {
    ObjectMapper objectMapper = new ObjectMapper();
    DtoToTransfer equipmentData = new DtoToTransfer();
    String resultDtoToTransfer;

    public RestObjectMapper() throws JsonProcessingException {
        equipmentData.setParam1(100);
        equipmentData.setParam2(true);
        equipmentData.setParam3("str");
        equipmentData.setArray(new int[]{1, 2, 3, 5, 6, 7, 8, 9, 10});
            InnerDtoData innerDtoData = new InnerDtoData();
            innerDtoData.setParam1("Hello");
            innerDtoData.setParam2("Yo");
        equipmentData.setInnerDtoData(innerDtoData);
        resultDtoToTransfer = objectMapper.writeValueAsString(equipmentData);
    }
}
