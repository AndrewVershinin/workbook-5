package com.pluralsight;

public class MainApp {
    public static void main(String[] args) {
        Moped slowRide = new Moped("Red", 7, 2, 0);
//        slowRide.setColor("Red");
//        slowRide.setFuelCapacity(5);
//        slowRide.setNumberOfPassengers(1);

        Car familyCar = new Car("Blue", 50, 5, 100);
//        familyCar.setColor("Blue");
//        familyCar.setNumberOfPassengers(5);
//        familyCar.setFuelCapacity(50);

        SemiTruck bigCar = new SemiTruck("Black", 120, 2, 3000);
//        bigRig.setColor("Black");
//        bigRig.setCargoCapacity(3000);
//        bigRig.setFuelCapacity(120);

        Hovercraft airWater = new Hovercraft("White", 80, 4, 200);
//        airFloater.setColor("White");
//        airFloater.setFuelCapacity(80);
//        airFloater.setNumberOfPassengers(4);

        System.out.println("Moped color: " + slowRide.getColor());
        System.out.println("Car passenger capacity: " + familyCar.getNumberOfPassengers());
        System.out.println("SemiTruck cargo capacity: " + bigCar.getCargoCapacity());
        System.out.println("Hovercraft fuel capacity: " + airWater.getFuelCapacity());


    }
}
