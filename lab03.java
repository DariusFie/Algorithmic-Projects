//Darius Fields

import java.util.Scanner;
public class lab03{
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constant/Retail price
        final double price = 99.0;

        System.out.print("Enter the number of packages: \n");
        int quantity = scanner.nextInt();

   
        double discount = 0.0;
        
        //Using the if's and else if's will help the program calculate which amounts are
        //good for each discount
        if (quantity >= 10 && quantity <= 19) {
            discount = 20.0;        
        } 
        
        else if (quantity >= 20 && quantity <= 49) {
            discount = 30.0;       
        } 
        
        else if (quantity >= 50 && quantity <= 99) {
            discount = 40.0;
        } 
        
        else if (quantity >= 100) {
            discount = 50.0;
        }
        //Without the System.exit(0), the code will continue the rest of the output lines and 
        //it will not exit. 
        
        
        else {
        	System.out.println("Invalid value for package count! Exiting the program!");
        	System.exit(0);
        }
        	
        // These will help calculate the amounts accurately in the end
        double totalB = quantity * price;
        double discountA = totalB * (discount / 100);
        double totalA = totalB - discountA;

        
        System.out.println("Total Bill Amount (before discount): $" + totalB);
        System.out.println("Discount rate: " + discount + "%");
        System.out.println("Amount of discount: $" + discountA);
        System.out.println("Total Bill Amount (after discount): $" + totalA);
        
    }
    
}

		