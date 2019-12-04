package com.companic.model.entity;

import com.companic.model.CarBuilder;

public class TruckBuilder extends CarBuilder {
    private Duty duty;
    private int payload;

    public TruckBuilder truck() {
        return new TruckBuilder();
    }

    public TruckBuilder withDuty(Duty duty) {
        this.duty = duty;
        return this;
    }

    public TruckBuilder withPayload(int payload) {
        this.payload = payload;
        return this;
    }

    public Truck build() {
        return new Truck(this);
    }

    public Duty getDuty() {
        return duty;
    }

    public void setDuty(Duty duty) {
        this.duty = duty;
    }

    public int getPayload() {
        return payload;
    }

    public void setPayload(int payload) {
        this.payload = payload;
    }
}