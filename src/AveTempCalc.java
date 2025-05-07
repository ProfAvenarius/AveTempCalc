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

        double aveTemp;

        aveTemp = Arrays.stream(tempArray).sum()/tempArray.length;

        for (int i = 0; i < 5; i++) {
            if (aveTemp > tempArray[i]) {
                System.out.println("The " + i + "Temperature enterered is lower than the average temperature of " + aveTemp + "." );
            }
        }


        System.out.println(Arrays.toString(tempArray));
        System.out.println(aveTemp);




    }
}
