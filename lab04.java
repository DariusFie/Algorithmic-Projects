//Darius Fields
import java.util.Scanner;

public class lab04 {
	
    public static void main(String[] args) {
        Scanner points = new Scanner(System.in);
        int bookspurchased;
        
        // Ask the user how many books they bought
        
            System.out.print("How many books did you purchase at BN booksellers this month?: \n");
            	
             
            bookspurchased = points.nextInt();
         
        // Add system.exit(0) when wanting the program to end and exit
        if (bookspurchased < 0) {
        	System.out.println("Invalid value entered! Exiting the program!");
        	System.exit(0);
        }
        else {
        	 int pointsearned;

        // The points earned will be determined using a switch statement
        switch (bookspurchased) {
            case 0:
                pointsearned = 0;
                System.out.println("You have not earned any points yet. Make a book purchase to start earning points!");
                break;
            case 1:
                pointsearned = 5;
                System.out.println("Congratulations!!! You have earned: " + pointsearned + " points!");
                System.out.println("You may redeem these points on your next book purchase!");
                break;
            case 2:
                pointsearned = 15;
                System.out.println("Congratulations!!! You have earned: " + pointsearned + " points!");
                System.out.println("You may redeem these points on your next book purchase!");
                break;
            case 3:
                pointsearned = 30;
                System.out.println("Congratulations!!! You have earned: " + pointsearned + " points!");
                System.out.println("You may redeem these points on your next book purchase!");
                break;
            default:  //for 4 or more books
                pointsearned = 60;
                System.out.println("Congratulations!!! You have earned: " + pointsearned + " points!");
                System.out.println("You may redeem these points on your next book purchase!");
                break;
      
                
           
        }
     
        
    }
}
}