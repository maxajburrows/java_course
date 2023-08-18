package chapter3;

import java.util.Scanner;

public class ChangeForADollar {
    public static void main(String[] args) {
        //Initialise known values
        int target = 100;

        //Get user inputs
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many pennies");
        int pennies = scanner.nextInt();

        System.out.println("How many nickels");
        int nickels = scanner.nextInt();

        System.out.println("How many dimes");
        int dimes = scanner.nextInt();

        System.out.println("How many quarters");
        int quarters = scanner.nextInt();
        scanner.close();

        int total = pennies + 5*nickels + 10*dimes + 25*quarters;

        if(total == target){
            System.out.println("You win!");
        }
        else if(total > target){
            int overBy = total - target;
            System.out.println("You lose! You were over by " + overBy + " cents");
        }
        else{
            int underBy = target - total;
            System.out.println("You lose! You were under by " + underBy + " cents");
        }
    }
}
