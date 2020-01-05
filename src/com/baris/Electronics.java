package com.baris;

public class Electronics
{
    private boolean power =true;

    public boolean isPower() {
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
        if (power==true)
        {
            System.out.println("Electronics is on");

        }
        else
        {
            System.out.println("Electronics is off");
        }
    }
}
