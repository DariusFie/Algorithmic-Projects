//Darius Fields
import java.util.Scanner;

public class lab05 {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Give the user the option to enter the purchase amount
        System.out.print("How many dollars would you like to spend on chocolate from the vending machine?:\n");
        int dollars = scanner.nextInt();
        
        int chocolateBars = 0;
        int coupons = 0;
        
        chocolateBars = dollars;
        coupons = dollars;
        
        // Using a loop statement that'll continue to redeem coupons
        while (coupons >= 6) 
        {
            int whatsLeft = coupons / 6;
            chocolateBars += whatsLeft;
            coupons = coupons % 6 + whatsLeft;
        }
        
        // Using if statement for an invalid value
        if (dollars < 0) 
        {
            System.out.println("Invalid value for amount! Exiting the program!");
            System.exit(0);   
        }
        
        // Output for the results
        System.out.println("You can buy " + chocolateBars + " chocolate bars and will have " + coupons + " coupons left!");
        
    }
}