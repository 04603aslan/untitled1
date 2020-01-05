package com.baris;

public class MyComputer {

    public static void main(String[] args) {

        Laptop Asus = new Laptop("Windows 10",1234);
        Asus.setBatteryPercentage(100);
        Asus.setBrandName("Asus");
        Asus.setPower(true);
        Asus.installProgram("Microsoft Word");
        Asus.installProgram("Steam");
        Asus.installProgram("Photoshop");
        Asus.removeProgram(1);
        Asus.listAllPrograms();
    }
}
