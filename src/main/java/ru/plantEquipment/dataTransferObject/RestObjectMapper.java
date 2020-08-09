package ru.plantEquipment.dataTransferObject;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import ru.plantEquipment.domain.Message;

public class RestObjectMapper {
    ObjectMapper objectMapper = new ObjectMapper();
    DtoToTransfer equipmentData = new DtoToTransfer();
    public String resultDtoToTransfer;

    public RestObjectMapper(Message message) throws JsonProcessingException {
        equipmentData.setId(message.getId());
        equipmentData.setOborudovaiye(message.getOborudovaiye());
        equipmentData.setRaspologeniye(message.getRaspologeniye());
        equipmentData.setNomerBloka(message.getNomerBloka());
        equipmentData.setSistemaAvtomatiki(message.getSistemaAvtomatiki());
        equipmentData.setNomerUso(message.getNomerUso());
        equipmentData.setNomerCi(message.getNomerCi());
        equipmentData.setHodZapornoyArmaturi(message.getHodZapornoyArmaturi());
        equipmentData.setModbusSkorost(message.getModbusSkorost());
        equipmentData.setModbusAddress(message.getModbusAddress());
        equipmentData.setModbusNastroyki(message.getModbusNastroyki());
        equipmentData.setMaxTorque(message.getMaxTorque());
        equipmentData.setCloseTorque(message.getCloseTorque());
        equipmentData.setStartOpenTorque(message.getStartOpenTorque());
        equipmentData.setOpenTorque(message.getOpenTorque());
        equipmentData.setStartCloseTorque(message.getStartCloseTorque());
        equipmentData.setZdType(message.getZdType());
        equipmentData.setTimeToSleepMode(message.getTimeToSleepMode());
        equipmentData.setNalichieDiskretCommands(message.getNalichieDiskretCommands());
        equipmentData.setOpenPosition(message.getOpenPosition());
        equipmentData.setClosePosition(message.getClosePosition());
        equipmentData.setHorizontalPologeniye(message.getHorizontalPologeniye());
        equipmentData.setVerticalPologeniye(message.getVerticalPologeniye());
        equipmentData.setStructuralScheme(message.getStructuralScheme());
        equipmentData.setEquipmentShkaf(message.getEquipmentShkaf());
        equipmentData.setPageOnStructuralScheme(message.getPageOnStructuralScheme());
        equipmentData.setUsoPage(message.getUsoPage());
        equipmentData.setDummy(message.getDummy());
        equipmentData.setDummy2(message.getDummy2());
            InnerDtoData innerDtoData = new InnerDtoData();
            innerDtoData.setParam1("Hello");
            innerDtoData.setParam2("Yo");
        equipmentData.setInnerDtoData(innerDtoData);
        resultDtoToTransfer = objectMapper.writeValueAsString(equipmentData);
    }
}
