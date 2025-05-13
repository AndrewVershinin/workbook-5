package com.pluralsight;

import java.util.ArrayList;

public class AssetsApp {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();

        assets.add(new House("My main house", "2025-05-11"
                , 400000, "2020 King School"
                , 1, 2200, 8000));

        assets.add(new House("My vacation house", "2024-05-11"
                , 444000, "888 Yaitsa"
                , 2, 2000, 6000));

        assets.add(new Vehicle("Tom's truck", "2022-01-20", 35000,
                "Ford F-150", 2021, 25000));
        assets.add(new Vehicle("My car", "2024-09-12", 48000,
                "Audi s3", 2024, 15000));

        for (Asset asset : assets) {
            System.out.println("Description: " + asset.getDescription());
            System.out.println("Date Acquired: " + asset.getDateAcquired());
            System.out.printf("Original Cost: $%.2f\n", asset.getOriginalCost());
            System.out.printf("Current Value: $%.2f\n", asset.getValue());

            if (asset instanceof House) {
                House house = (House) asset;
                System.out.println("Address: " + house.getAddress());
            } else if (asset instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) asset;
                System.out.println("Make & Year: " + vehicle.getYear() + " " + vehicle.getMakeModel());
            }

            System.out.println("^^^^^^^^^");
        }
    }


}
