import java.util.Arrays;
import java.util.Scanner;

public class AveTempCalc {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double[] tempArray;
        tempArray = new double[5];

        System.out.println("Provide 5 temperatures:");

        System.out.println("Temperature 1: ");
        tempArray[0]= scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Temperature 2: ");
        tempArray[1]= scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Temperature 3: ");
        tempArray[2]= scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Temperature 4: ");
        tempArray[3]= scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Temperature 5: ");
        tempArray[4]= scanner.nextDouble();
        scanner.nextLine();

        System.out.println(Arrays.toString(tempArray));


    }
}
