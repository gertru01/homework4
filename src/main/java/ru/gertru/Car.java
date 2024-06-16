package ru.gertru;

public class Car {

    int currentSpeed = 0;

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void speedUp(int speed) {
        currentSpeed += speed;
    }

    public void brake() {
        if (currentSpeed <= 10) {
            currentSpeed = 0;
        } else {
            currentSpeed -= 10;
        }
    }
}
