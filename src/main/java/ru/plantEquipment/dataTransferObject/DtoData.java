package ru.plantEquipment.dataTransferObject;

import ru.plantEquipment.domain.Message;

public class DtoData {
    private Long id;
    private String oborudovaiye;
    private String raspologeniye;
    private String nomerBloka;
    private String sistemaAvtomatiki;
    private String nomerUso;
    private String nomerCi;
    private String hodZapornoyArmaturi;
    private String modbusSkorost;
    private String modbusAddress;
    private String modbusNastroyki;
    private String maxTorque;
    private String closeTorque;
    private String startOpenTorque;
    private String openTorque;
    private String startCloseTorque;
    private String zdType;
    private String timeToSleepMode;
    private String nalichieDiskretCommands;
    private String openPosition;
    private String closePosition;
    private String horizontalPologeniye;
    private String verticalPologeniye;
    private String structuralScheme;
    private String equipmentShkaf;
    private String pageOnStructuralScheme;
    private String usoPage;
    private String dummy;
    private String dummy2;

    public DtoData(Message message) {
        this.setId(message.getId());
        this.setOborudovaiye(message.getOborudovaiye());
        this.setRaspologeniye(message.getRaspologeniye());
        this.setNomerBloka(message.getNomerBloka());
        this.setSistemaAvtomatiki(message.getSistemaAvtomatiki());
        this.setNomerUso(message.getNomerUso());
        this.setNomerCi(message.getNomerCi());
        this.setHodZapornoyArmaturi(message.getHodZapornoyArmaturi());
        this.setModbusSkorost(message.getModbusSkorost());
        this.setModbusAddress(message.getModbusAddress());
        this.setModbusNastroyki(message.getModbusNastroyki());
        this.setMaxTorque(message.getMaxTorque());
        this.setCloseTorque(message.getCloseTorque());
        this.setStartOpenTorque(message.getStartOpenTorque());
        this.setOpenTorque(message.getOpenTorque());
        this.setStartCloseTorque(message.getStartCloseTorque());
        this.setZdType(message.getZdType());
        this.setTimeToSleepMode(message.getTimeToSleepMode());
        this.setNalichieDiskretCommands(message.getNalichieDiskretCommands());
        this.setOpenPosition(message.getOpenPosition());
        this.setClosePosition(message.getClosePosition());
        this.setHorizontalPologeniye(message.getHorizontalPologeniye());
        this.setVerticalPologeniye(message.getVerticalPologeniye());
        this.setStructuralScheme(message.getStructuralScheme());
        this.setEquipmentShkaf(message.getEquipmentShkaf());
        this.setPageOnStructuralScheme(message.getPageOnStructuralScheme());
        this.setUsoPage(message.getUsoPage());
        this.setDummy(message.getDummy());
        this.setDummy2(message.getDummy2());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOborudovaiye() {
        return oborudovaiye;
    }

    public void setOborudovaiye(String oborudovaiye) {
        this.oborudovaiye = oborudovaiye;
    }

    public String getRaspologeniye() {
        return raspologeniye;
    }

    public void setRaspologeniye(String raspologeniye) {
        this.raspologeniye = raspologeniye;
    }

    public String getNomerBloka() {
        return nomerBloka;
    }

    public void setNomerBloka(String nomerBloka) {
        this.nomerBloka = nomerBloka;
    }

    public String getSistemaAvtomatiki() {
        return sistemaAvtomatiki;
    }

    public void setSistemaAvtomatiki(String sistemaAvtomatiki) {
        this.sistemaAvtomatiki = sistemaAvtomatiki;
    }

    public String getNomerUso() {
        return nomerUso;
    }

    public void setNomerUso(String nomerUso) {
        this.nomerUso = nomerUso;
    }

    public String getNomerCi() {
        return nomerCi;
    }

    public void setNomerCi(String nomerCi) {
        this.nomerCi = nomerCi;
    }

    public String getHodZapornoyArmaturi() {
        return hodZapornoyArmaturi;
    }

    public void setHodZapornoyArmaturi(String hodZapornoyArmaturi) {
        this.hodZapornoyArmaturi = hodZapornoyArmaturi;
    }

    public String getModbusSkorost() {
        return modbusSkorost;
    }

    public void setModbusSkorost(String modbusSkorost) {
        this.modbusSkorost = modbusSkorost;
    }

    public String getModbusAddress() {
        return modbusAddress;
    }

    public void setModbusAddress(String modbusAddress) {
        this.modbusAddress = modbusAddress;
    }

    public String getModbusNastroyki() {
        return modbusNastroyki;
    }

    public void setModbusNastroyki(String modbusNastroyki) {
        this.modbusNastroyki = modbusNastroyki;
    }

    public String getMaxTorque() {
        return maxTorque;
    }

    public void setMaxTorque(String maxTorque) {
        this.maxTorque = maxTorque;
    }

    public String getCloseTorque() {
        return closeTorque;
    }

    public void setCloseTorque(String closeTorque) {
        this.closeTorque = closeTorque;
    }

    public String getStartOpenTorque() {
        return startOpenTorque;
    }

    public void setStartOpenTorque(String startOpenTorque) {
        this.startOpenTorque = startOpenTorque;
    }

    public String getOpenTorque() {
        return openTorque;
    }

    public void setOpenTorque(String openTorque) {
        this.openTorque = openTorque;
    }

    public String getStartCloseTorque() {
        return startCloseTorque;
    }

    public void setStartCloseTorque(String startCloseTorque) {
        this.startCloseTorque = startCloseTorque;
    }

    public String getZdType() {
        return zdType;
    }

    public void setZdType(String zdType) {
        this.zdType = zdType;
    }

    public String getTimeToSleepMode() {
        return timeToSleepMode;
    }

    public void setTimeToSleepMode(String timeToSleepMode) {
        this.timeToSleepMode = timeToSleepMode;
    }

    public String getNalichieDiskretCommands() {
        return nalichieDiskretCommands;
    }

    public void setNalichieDiskretCommands(String nalichieDiskretCommands) {
        this.nalichieDiskretCommands = nalichieDiskretCommands;
    }

    public String getOpenPosition() {
        return openPosition;
    }

    public void setOpenPosition(String openPosition) {
        this.openPosition = openPosition;
    }

    public String getClosePosition() {
        return closePosition;
    }

    public void setClosePosition(String closePosition) {
        this.closePosition = closePosition;
    }

    public String getHorizontalPologeniye() {
        return horizontalPologeniye;
    }

    public void setHorizontalPologeniye(String horizontalPologeniye) {
        this.horizontalPologeniye = horizontalPologeniye;
    }

    public String getVerticalPologeniye() {
        return verticalPologeniye;
    }

    public void setVerticalPologeniye(String verticalPologeniye) {
        this.verticalPologeniye = verticalPologeniye;
    }

    public String getStructuralScheme() {
        return structuralScheme;
    }

    public void setStructuralScheme(String structuralScheme) {
        this.structuralScheme = structuralScheme;
    }

    public String getEquipmentShkaf() {
        return equipmentShkaf;
    }

    public void setEquipmentShkaf(String equipmentShkaf) {
        this.equipmentShkaf = equipmentShkaf;
    }

    public String getPageOnStructuralScheme() {
        return pageOnStructuralScheme;
    }

    public void setPageOnStructuralScheme(String pageOnStructuralScheme) {
        this.pageOnStructuralScheme = pageOnStructuralScheme;
    }

    public String getUsoPage() {
        return usoPage;
    }

    public void setUsoPage(String usoPage) {
        this.usoPage = usoPage;
    }

    public String getDummy() {
        return dummy;
    }

    public void setDummy(String dummy) {
        this.dummy = dummy;
    }

    public String getDummy2() {
        return dummy2;
    }

    public void setDummy2(String dummy2) {
        this.dummy2 = dummy2;
    }
}
