package com.example.iphone.devices;

public abstract class Smartphone {
    protected String model;
    protected String manufacturer;
    protected String imei;
    protected int memoryGb;
    protected boolean poweredOn;

    public Smartphone(String model, String manufacturer, String imei, int memoryGb) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.imei = imei;
        this.memoryGb = memoryGb;
        this.poweredOn = false;
    }

    public void powerOnDevice() {
        if (!poweredOn) {
            poweredOn = true;
            System.out.println(model + " powered on.");
        } else {
            System.out.println(model + " is already on.");
        }
    }

    public void powerOffDevice() {
        if (poweredOn) {
            poweredOn = false;
            System.out.println(model + " powered off.");
        } else {
            System.out.println(model + " is already off.");
        }
    }

    public void connectToInternet() {
        if (poweredOn) {
            System.out.println(model + " connecting to the internet...");
        } else {
            System.out.println("Please power on the device before connecting to the internet.");
        }
    }

    // Basic getters
    public String getModel() { return model; }
    public String getManufacturer() { return manufacturer; }
    public String getImei() { return imei; }
    public int getMemoryGb() { return memoryGb; }
    public boolean isPoweredOn() { return poweredOn; }
}
