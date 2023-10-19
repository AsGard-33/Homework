package de.ait.homework.homework37;

import java.util.UUID;
public class MobilePhone {
    private UUID id;
    private String brand;
    private String model;
    private String operatingSystem;
    private double price;

    public MobilePhone(String brand, String model, String operatingSystem, double price) {
        this.id = UUID.randomUUID();
        this.brand = brand;
        this.model = model;
        this.operatingSystem = operatingSystem;
        this.price = price;
    }

    public UUID getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}