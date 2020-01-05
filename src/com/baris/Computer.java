package com.baris;

import javax.swing.*;
import java.util.ArrayList;

public class Computer extends  Electronics
{
protected String operatingSystem;
protected ArrayList<String> programInstalled = new ArrayList<>();
protected  long serialNo;

    public long getSerialNo() {
        return serialNo;
    }

    public String getIOS()
    {
        return operatingSystem;
    }

    public Computer(String os, long sno)
{
    this.operatingSystem =os;
    this.serialNo=sno;
}
public void installProgram(String programName)
{
    this.programInstalled.add(programName);

}

public void removeProgram(int programIndex)
{
    this.programInstalled.remove(programIndex);
}
public  void  listAllPrograms()
{
    JOptionPane.showMessageDialog(null,programInstalled);
}

}
