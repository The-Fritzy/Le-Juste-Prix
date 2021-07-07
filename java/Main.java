///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//  ___       _______              ___  ___  ___  ________  _________  _______           ________  ________  ___     ___    ___  //
// |\  \     |\  ___ \            |\  \|\  \|\  \|\   ____\|\___   ___\\  ___ \         |\   __  \|\   __  \|\  \   |\  \  /  /| //
// \ \  \    \ \   __/|           \ \  \ \  \\\  \ \  \___|\|___ \  \_\ \   __/|        \ \  \|\  \ \  \|\  \ \  \  \ \  \/  / / //
//  \ \  \    \ \  \_|/__       __ \ \  \ \  \\\  \ \_____  \   \ \  \ \ \  \_|/__       \ \   ____\ \   _  _\ \  \  \ \    / /  //
//   \ \  \____\ \  \_|\ \     |\  \\_\  \ \  \\\  \|____|\  \   \ \  \ \ \  \_|\ \       \ \  \___|\ \  \\  \\ \  \  /     \/   //
//    \ \_______\ \_______\    \ \________\ \_______\____\_\  \   \ \__\ \ \_______\       \ \__\    \ \__\\ _\\ \__\/  /\   \   //
//     \|_______|\|_______|     \|________|\|_______|\_________\   \|__|  \|_______|        \|__|     \|__|\|__|\|__/__/ /\ __\  //
//                                                  \|_________|                                                    |__|/ \|__|  //
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// Author : A.L Mitroi

// Import random for create a random int with the name "juste_prix"
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Welcome, Into Le Juste Prix ! (French Name of The Game)");
	    
	    Random random = new Random();
	    
	    // Define the range of the number to write
	    int range1 = 0, range2 = 15;
	    int juste_prix = random.nextInt(range2 - range1) + range1;
	    boolean gameLoop = true;

	    // Game Loop
	    while (gameLoop = true) {
	        // Input of the number of user
	    	Scanner scan = new Scanner(System.in);
	    	System.out.printf("Enter The Number you think is correct between %d and %d : ", range1, range2);
	    	int number_of_user = scan.nextInt();

	        // Verify if the number of the user is in the range
	    	if (number_of_user > range2) {
	    		System.out.println("ERROR : Number Out of Range");
	    	}
	    	
	    	else {
	    		
	            // If number is too small
	            if (juste_prix > number_of_user) {
	            	System.out.println("Number Too Small");
	            }

	            // If number is too large
	            else if (juste_prix < number_of_user) {
	            	System.out.println("Number Too Large");
	    	    }

	            // If number is good
	            else if (juste_prix == number_of_user) {
	            	System.out.printf("Well done you found it! the number to guess was : %d\n", juste_prix);
	    		}
	    	}
	    }
	}
}
