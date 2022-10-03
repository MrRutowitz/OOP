package org.example.przeciazanie;

public class Roadster {
    float topSpeed;
    float acceleration;

    float crazyTopSpeed;
    float crazyAcceleration;

    Roadster(float topSpeed, float acceleration) {
        this.topSpeed = topSpeed;
        this.acceleration = acceleration;

    }

    Roadster(float topSpeed, float acceleration, float crazyTopSpeed, float crazyAcceleration) {
        this.topSpeed = topSpeed;
        this.acceleration = acceleration;
        this.crazyTopSpeed = crazyTopSpeed;
        this.crazyAcceleration = crazyAcceleration;
    }

    public float getTopSpeed() {
        return this.topSpeed;
    }

    public float getAcceleration() {
        return this.acceleration;
    }

    public float getTopSpeed(boolean crazyMode) {
        if (crazyMode) {
            return crazyTopSpeed;
        } else {
            return topSpeed;
        }
    }

    public float getAcceleration(boolean crazyMode) {
        if (crazyMode == true) {
            return crazyAcceleration;
        } else {
            return acceleration;
        }
    }
}



