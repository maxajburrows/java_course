package chapter4;

import java.util.Scanner;

public class GrossPayInputValidation {
    public static void main(String[] args) {

        //Initialise known variables
        int rate = 15;
        int maxHours = 40;
        int minHours = 1;

        //Get input for unknown varaibles
        System.out.println("How many hows did you work this week?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        //Validate input
        while(hoursWorked > maxHours || hoursWorked < minHours){
            System.out.println("Invalid entry. Your hours must be between 1 and 40. Try again.");
            hoursWorked = scanner.nextDouble();

        }

        scanner.close();

        //Calculate gross
        double gross = rate*hoursWorked;
        System.out.println("Gross Pay: $" + gross);
    }
}
