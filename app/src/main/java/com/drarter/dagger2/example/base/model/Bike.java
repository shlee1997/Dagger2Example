package com.drarter.dagger2.example.base.model;

import android.support.annotation.NonNull;

public class Bike {

    private Motor motor;

    public Bike(@NonNull Motor motor) {
        this.motor = motor;
    }

    public void increaseSpped() {
        this.motor.setSpeed(this.motor.getRpm() + 1);
    }

    public void decreaseSpeed() {
        if (this.motor.getRpm() > 0) {
            this.motor.setSpeed(this.motor.getRpm() - 1);
        }
    }

    public int getSpeed() {
        return this.motor.getRpm();
    }
}
