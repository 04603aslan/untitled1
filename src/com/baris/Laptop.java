package com.baris;

public class Laptop extends Computer


{



    private int batteryPercentage;
    private String brandName;

    public Laptop(String os, long sno) {
        super(os, sno);
    }

    public int getBatteryPercentage() {
        return batteryPercentage;
    }

    public void setBatteryPercentage(int batteryPercentage) {
        this.batteryPercentage = batteryPercentage;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
}
