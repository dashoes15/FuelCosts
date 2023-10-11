import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter:");
        boolean done = false;
        double gallon = 0;
        do {
            System.out.println("The number of gallons of gas in the tank:");
            if (scan.hasNextDouble()) {
                gallon = scan.nextDouble();
                if (gallon > 0) {
                    System.out.println(gallon);
                    done = true;
                }else{
                    System.out.println("You have entered something less than zero!");
                    scan.nextLine();
                }
            }else{
                System.out.println("You have entered something invalid.Try again.");
                scan.nextLine();
            }
        } while (!done);

        double fuelEff = 0;
        done = false;
        do {
            System.out.println("The fuel efficiency in miles per gallon:");
            if (scan.hasNextDouble()) {
                fuelEff = scan.nextDouble();
                if (fuelEff > 0) {
                    System.out.println(fuelEff);
                    done = true;
                }else{
                    System.out.println("You have entered something less than zero!");
                    scan.nextLine();
                }
            }else{
                System.out.println("You have entered something invalid.Try again.");
                scan.nextLine();
            }
        } while (!done);
        System.out.println("The price of gas per gallon:");
        double price = 0;
        done = false;
        do {
            System.out.println("The fuel efficiency in miles per gallon:");
            if (scan.hasNextDouble()) {
                price = scan.nextDouble();
                if (price > 0) {
                    System.out.println(price);
                    done = true;
                }else{
                    System.out.println("You have entered something less than zero!");
                    scan.nextLine();
                }
            }else{
                System.out.println("You have entered something invalid.Try again.");
                scan.nextLine();
            }
        } while (!done);
        System.out.println("The car can go " + gallon/fuelEff + " miles." );
        System.out.println("The price of gas per 100 miles is: " + (price/fuelEff)*100);
    }
}