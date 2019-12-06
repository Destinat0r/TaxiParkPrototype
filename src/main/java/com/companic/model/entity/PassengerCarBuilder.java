package com.companic.model.entity;

public class PassengerCarBuilder extends CarBuilder<PassengerCarBuilder> {

    private Body body;
    private int passengersAmount;

    public static PassengerCarBuilder passengerCar() {
        return new PassengerCarBuilder();
    }

    public PassengerCarBuilder withBody(Body body) {
        this.body = body;
        return this;
    }

    public PassengerCarBuilder withPassengersAmount(int amount) {
        this.passengersAmount = amount;
        return this;
    }

    public PassengerCar build() {
        return new PassengerCar(this);
    }

    public Body getBody() {
        return body;
    }

    public int getPassengersAmount() {
        return passengersAmount;
    }
}
