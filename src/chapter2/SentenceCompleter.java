package chapter2;

import java.util.Scanner;
public class SentenceCompleter {
    public static void main(String[] args) {
        System.out.println("Pick a season!");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        System.out.println("Pick a whole number!");
        int numberOfCoffees = scanner.nextInt();

        System.out.println("Pick an adjective!");
        String adjective = scanner.next();
        scanner.close();

        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + numberOfCoffees + " cups of coffee.");



    }
}
