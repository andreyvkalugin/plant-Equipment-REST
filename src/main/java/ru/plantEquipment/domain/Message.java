package ru.plantEquipment.domain;

import javax.persistence.*;
import java.util.Map;

@Entity
public class Message {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
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


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="user_id")
    private User author;
    private String filename;
    public Message() {
    }

    public Message(Map<String, String> map, User author) {
        this.oborudovaiye = map.get("oborudovaiye");
        this.raspologeniye = map.get("raspologeniye");
        this.nomerBloka = map.get("nomerBloka");
        this.sistemaAvtomatiki = map.get("sistemaAvtomatiki");
        this.nomerUso = map.get("nomerUso");
        this.nomerCi = map.get("nomerCi");
        this.hodZapornoyArmaturi = map.get("hodZapornoyArmaturi");
        this.modbusSkorost = map.get("modbusSkorost");
        this.modbusAddress = map.get("modbusAddress");
        this.modbusNastroyki = map.get("modbusNastroyki");
        this.maxTorque = map.get("maxTorque");
        this.closeTorque = map.get("closeTorque");
        this.startOpenTorque = map.get("startOpenTorque");
        this.openTorque = map.get("openTorque");
        this.startCloseTorque = map.get("startCloseTorque");
        this.zdType = map.get("zdType");
        this.timeToSleepMode = map.get("timeToSleepMode");
        this.nalichieDiskretCommands = map.get("nalichieDiskretCommands");
        this.openPosition = map.get("openPosition");
        this.closePosition = map.get("closePosition");
        this.horizontalPologeniye = map.get("horizontalPologeniye");
        this.verticalPologeniye = map.get("verticalPologeniye");
        this.structuralScheme = map.get("structuralScheme");
        this.equipmentShkaf = map.get("equipmentShkaf");
        this.pageOnStructuralScheme = map.get("pageOnStructuralScheme");
        this.usoPage = map.get("usoPage");
        this.dummy = map.get("dummy");
        this.dummy2 = map.get("dummy2");
        this.author = author;
    }

    public String getAuthorName(){
        return author != null ? author.getUsername():"<none>";
    }
    public User getAuthor() {return author;}

    public void setAuthor(User author) {this.author = author;}

    public Long getId() {
        return id;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
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
