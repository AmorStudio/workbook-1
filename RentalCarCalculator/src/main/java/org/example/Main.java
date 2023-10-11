package org.example;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the Pickup date : ");



        System.out.println("Please enter the number of days for the rental : ");
        int Days = scanner.nextInt();


        System.out.println("Do you want an electronic toll tag at $3.95/day (Y/N): ");
        char tag = scanner.next().charAt(0);
        boolean isYesForTag = tag == 'Y';


        System.out.println("Do you want an GPS tag at $2.95/day (Y/N): ");
        char GPS = scanner.next().charAt(0);
        boolean isYESForGPS = GPS == 'Y';

        System.out.println("Do you want roadside assistance at $3.95/day (Y/N): ");
        char RoadAssistance = scanner.next().charAt(0);
        boolean isYesForRoadAssistance = RoadAssistance == 'Y';

        System.out.println ("Enter your age: ");
        int age = scanner.nextInt();


        doCalculation(Days, isYesForTag, isYESForGPS, isYesForRoadAssistance, age);

    }


public static void doCalculation ( int Days, boolean isYesfortag, boolean isYesForGPS, boolean isYesForRoadAssistance, int age) {

    double AdditionRateForTagAndRoadAssistance = 3.95;
    double AdditionRateForGPS = 2.95;
    double basic_car_rental = 29.99;
    double UnderAgeCharge = (double) (30 / 100) * basic_car_rental;

    double charge = Days * basic_car_rental;
    System.out.println("Basic Car Rental For " + Days + " is :" + charge);
    System.out.println ("Options cost: ");


    if (isYesForGPS) {
        charge += AdditionRateForGPS;
        System.out.println(" for GPS : 2.95 ");
    }
    if (isYesForRoadAssistance) {
        charge += AdditionRateForTagAndRoadAssistance;
        System.out.println(" for RoadAssistance : 3.95");
    }
    if (isYesfortag) {
        charge += AdditionRateForTagAndRoadAssistance;
        System.out.println(" for and Tag: 3.95 ");
    }
    if (age<25)
    {
        charge+= UnderAgeCharge;
        System.out.println("for UnderAgeCharge : " + UnderAgeCharge);
    }
    System.out.println("Your total Sum: " + charge);
}
}