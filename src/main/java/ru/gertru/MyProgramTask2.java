package ru.gertru;

public class MyProgramTask2 {

    public static void main(String[] args) {

        Car myCar = new Car();

        System.out.println(myCar.getCurrentSpeed());

        myCar.speedUp(25);
        System.out.println(myCar.getCurrentSpeed());

        myCar.brake();
        System.out.println(myCar.getCurrentSpeed());

        myCar.brake();
        System.out.println(myCar.getCurrentSpeed());

        myCar.brake();
        System.out.println(myCar.getCurrentSpeed());
    }
}
