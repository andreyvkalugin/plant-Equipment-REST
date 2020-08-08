package ru.plantEquipment.controller;

public class DtoToTransfer {
    private int param1;
    private boolean param2;
    private String param3;
    private int array[];
    private InnerDtoData innerDtoData;

    public InnerDtoData getInnerDtoData() {
        return innerDtoData;
    }

    public void setInnerDtoData(InnerDtoData innerDtoData) {
        this.innerDtoData = innerDtoData;
    }

    public int getParam1() {
        return param1;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public void setParam1(int param1) {
        this.param1 = param1;
    }

    public boolean isParam2() {
        return param2;
    }

    public void setParam2(boolean param2) {
        this.param2 = param2;
    }

    public String getParam3() {
        return param3;
    }

    public void setParam3(String param3) {
        this.param3 = param3;
    }
}
