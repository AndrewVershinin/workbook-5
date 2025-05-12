package com.pluralsight;

public class MainApp {
    public static void main(String[] args) {
        Moped slowRide = new Moped();
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);
        slowRide.setNumberOfPassengers(1);

        Car familyCar = new Car();
        familyCar.setColor("Blue");
        familyCar.setNumberOfPassengers(5);
        familyCar.setFuelCapacity(50);

        SemiTruck bigRig = new SemiTruck();
        bigRig.setColor("Black");
        bigRig.setCargoCapacity(3000);
        bigRig.setFuelCapacity(120);

        Hovercraft airFloater = new Hovercraft();
        airFloater.setColor("White");
        airFloater.setFuelCapacity(80);
        airFloater.setNumberOfPassengers(4);

        System.out.println("Moped color: " + slowRide.getColor());
        System.out.println("Car passenger capacity: " + familyCar.getNumberOfPassengers());
        System.out.println("SemiTruck cargo capacity: " + bigRig.getCargoCapacity());
        System.out.println("Hovercraft fuel capacity: " + airFloater.getFuelCapacity());
    }
}
