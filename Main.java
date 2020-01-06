package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String unitSystemInput;
        String convertingBetween;
        //2
        String convertingBetweenMetricToImperial;
        double metricToImperialTemperature;
        double metricToImperialTemperatureResult;
        double metricToImperialLength;
        double metricToImperialLengthResult;
        //4
        double imperialToMetric;
        double imperialToMetricResult;


        while (true) {
            System.out.print("From wich unit system you want to convert? (Metric or Imperial):");
            // First String input
            unitSystemInput = scanner.nextLine().toLowerCase().trim();

            if ((unitSystemInput.equals("metric")) || (unitSystemInput.equals("imperial"))) {
                //System.out.println(unitSystemInput);
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
                    System.out.print("Do you want to convert meters to feet or °C to °F? Write length or temperature.:");
                    //System.out.println("write down your values 2");
                    convertingBetweenMetricToImperial = scanner.nextLine().toLowerCase().trim();
                    if (convertingBetweenMetricToImperial.equals("length")) {
                        System.out.print("Meters to feet. Write your length. (in meters):");
                        metricToImperialLength = scanner.nextDouble();
                        metricToImperialLengthResult = Math.round( metricToImperialLength * 3.28 );                    // 1m = 3.28feet
                        System.out.println("It is " + metricToImperialLengthResult + " feet");
                        break;
                    }else if (convertingBetweenMetricToImperial.equals("temperature")){
                        System.out.print("Degrees Celsius to degrees Fahrenheit. Write temperature. (in Celsius):");
                        metricToImperialTemperature = scanner.nextDouble();
                        metricToImperialTemperatureResult = Math.round( (metricToImperialTemperature * 1.8) + 32 );
                        System.out.println("It is " + metricToImperialTemperatureResult + " °F");
                        break;
                    }
                }
            }else if (unitSystemInput.equals("imperial")){
                System.out.print("Do you want to convert to imperial values or metric unit system?:");
                convertingBetween = scanner.nextLine().toLowerCase().trim();
                if (convertingBetween.equals("imperial values")) {
                    System.out.println("write down your values 3");
                    break;
                }else if(convertingBetween.equals("metric unit system")) {
                    System.out.println("write down your values 4");
                    System.out.print("Degrees Fahrenheit to degrees Celsius. Write your temperature. (in Fahrenheit):");
                    imperialToMetric = scanner.nextDouble();
                    imperialToMetricResult = Math.round( (imperialToMetric - 32) / (1.8) );              // °C = (°F - 32) / 1.8
                    System.out.println("It is " + imperialToMetricResult + " °C");
                    break;
                }

            }System.out.println("Invalid input! Enter value again.:");
        }
    }
}
