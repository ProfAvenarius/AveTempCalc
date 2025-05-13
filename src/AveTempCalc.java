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

    public static void compareWithAveTemp(double[] temps, double ave) {
        for (int i = 0; i < temps.length; i++) {
            if (ave > temps[i]) {
                System.out.println(temps[i] + ", the " + i+1 + "/" + temps.length + " temperature in the list is lower than the average temperature of " + ave + "." );
            }
        }
    }


    public static void main(String[] args){

        int tempCount = numberOfTemps();

        double[] tempArray = inputTemp(tempCount);
        System.out.println("The full list of temperatures entered: " + Arrays.toString(tempArray));
        double aveTemp =calculateAveTemp(tempArray);
        System.out.println("The average temperature from this list is: " + aveTemp);
        compareWithAveTemp(tempArray, aveTemp);
    }
}