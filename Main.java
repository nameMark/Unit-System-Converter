package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String unitSystemInput;
        String convertingBetween;
        double metricToImperial;
        double metricToImperialResult;

        while (true) {
            System.out.print("From wich unit system you want to convert? (Metric or Imperial):");
            // First String input
            unitSystemInput = scanner.nextLine().toLowerCase().trim();

            if ((unitSystemInput.equals("metric")) || (unitSystemInput.equals("imperial"))) {
                System.out.println(unitSystemInput);
                break;
            }
            System.out.println("Invalid input! Enter value again.:");
        }


        while (true) {
            if (unitSystemInput.equals("metric")) {
                System.out.print("Do you want to convert to metric values or imperial unit system?:");
                convertingBetween = scanner.nextLine().toLowerCase().trim();
                if (convertingBetween.equals("metric values")) {
                    System.out.println("write down your values 1");
                    break;
                }else if(convertingBetween.equals("imperial unit system")) {
                    System.out.println("write down your values 2");
                    System.out.print("Meters to feet. Write your lenght. (in meters):");
                    metricToImperial = scanner.nextDouble();
                    metricToImperialResult = metricToImperial * 3.28;                    // 1m = 3.28feet
                    System.out.println("It is " + metricToImperialResult + " feet");
                    break;
                }
            }else if (unitSystemInput.equals("imperial")){
                System.out.print("Do you want to convert to imperial values or metric unit system?:");
                convertingBetween = scanner.nextLine().toLowerCase().trim();
                if (convertingBetween.equals("imperial values")) {
                    System.out.println("write down your values 3");
                    break;
                }else if(convertingBetween.equals("metric unit system")) {
                    System.out.println("write down your values 4");
                    break;
                }

            }System.out.println("Invalid input! Enter value again.:");
        }
    }
}
