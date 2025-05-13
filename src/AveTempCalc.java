//Description: A Java program that accepts a list of temperatures, converts fro. C to F and vice versa,
//             returns the average of the list, and which entries are less than the average.
//             An assignment for Datastructures & Algorithms.
//Author: DC Elliott SD-12
//Date: 05/13/2025



import java.util.Arrays;
import java.util.Scanner;

public class AveTempCalc {

    private static Scanner scanner = new Scanner(System.in);


    public static int numberOfTemps() {
        System.out.println("How many Temperature readings are available?");
        int tempCount = scanner.nextInt();
        scanner.nextLine();
        return tempCount;

    }
    //Needs error handling, added toUpperCase but needs a while loop...
    public static String unitOfTemp() {
        System.out.println("What unit of Temperature are the readings in, C or F?");
        String tempUnit = scanner.next().toUpperCase();
        scanner.nextLine();
        return tempUnit;
    }


    public static double[] inputTemp(int tempCount) {
        double[] tempArray = new double[tempCount];

        System.out.println("Provide " + tempCount + " temperatures:");

        for (int i = 0; i < tempCount; i++) {
            System.out.println("Temperature " + (i + 1) + ":");
            tempArray[i] = scanner.nextDouble();
            scanner.nextLine();
        }
        return tempArray;
    }

    public static double calculateAveTemp(double[] temps) {
        return Arrays.stream(temps).sum()/temps.length;
    }

    public static double[] calculateOtherUnits (String tempUnit, double[] temps) {
        double[] otherUnitsArray = new double[temps.length];
        if (tempUnit.equals("C")) {
            for (int i = 0; i < temps.length; i++) {
                otherUnitsArray[i] = (temps[i]*9/5)+32;
            }
        }else {
            for (int i = 0; i < temps.length; i++) {
                otherUnitsArray[i] = (temps[i]-32)*5/9;
            }
        }
        return otherUnitsArray;
    }


    public static void compareWithAveTemp(String unitTemp, double[] temps, double ave) {
        for (int i = 0; i < temps.length; i++) {
            if (ave > temps[i]) {
                System.out.println("The temperature " + temps[i] + unitTemp + ", the " + (i+1) + "/" + temps.length + " entry on the list is lower than the average temperature of " + ave + unitTemp + "." );
            }
        }
    }


    public static void main(String[] args){
        // Output built up over a few edits, some of it reads awkwardly, would revise and put it all in a 'if' statement to
        // seperate the unit logic, an output for C and a seperate for F.
        int tempCount = numberOfTemps();
        String tempUnit = unitOfTemp();
        double[] tempArray = inputTemp(tempCount);
        double[] convertedArray = calculateOtherUnits(tempUnit, tempArray);
        System.out.println("The full list of temperatures entered: " + Arrays.toString(tempArray));
        System.out.println("All of which are in " + tempUnit);
        if (tempUnit.equals("C")) {
            System.out.println("The temperatures converted into Fahrenheit are:" + Arrays.toString(convertedArray));
        } else {
            System.out.println("The temperatures converted into Celsius are:" + Arrays.toString(convertedArray));
        }

        double aveTemp =calculateAveTemp(tempArray);
        System.out.println("The average temperature from this list is: " + aveTemp + tempUnit);
        compareWithAveTemp(tempUnit, tempArray, aveTemp);
    }
}