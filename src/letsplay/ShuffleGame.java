package letsplay;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ShuffleGame {

	public int[] shuffleGame(int[] ar) {//{0, 1, 1}
                    //Array
		Random rnd = ThreadLocalRandom.current();

		for (int i = ar.length - 1; i > 0; i--) {

		int index = rnd.nextInt(i + 1);

		int a = ar[index];

		ar[index] = ar[i];

		ar[i] = a;

		}

		return ar;}
	public static void main(String[] args) {
        AnotherTry s = new AnotherTry();
        Scanner scanner = new Scanner(System.in);

        System.out.println("-----Welcome to shuffle game-----");
        System.out.println(" Guess where the 0 is?");
        System.out.println(" you ready to play?(y/n)");
        while (true) {
                // Methods , if statement, loop, recursive method
                char play = scanner.next().toLowerCase().charAt(0);
                if (play == 'y') {
                        while (true) {
                                int[] gameCards = { 0, 1, 1 };
                                int[] shuffled = s.shuffleGame(gameCards);
                                System.out.print("pick 1,2, or 3!");
                                int pick = scanner.nextInt();
                                if (pick <= 3 && pick > 0) {
                                        if (shuffled[pick-1] == 0) {
                                                System.out.println("Good guess!");
                                        } else {
                                                System.out.println("Sorry! wrong guess :/");
                                        }
                                        break;
                                } else {
                                        System.out.println("Invailid input :?");
                                        }
                        }
                } else if (play == 'n') {
                        System.out.println("See you next time!!");
                        break;
                } else {
                        System.out.println("Wrong choice, enter again!");
                        continue;
                }
                System.out.print("Do you want to try again?(y/n): ");
        }
        scanner.close();
}

}
                                

		


	
        
			
				
				
		      
			
				
				
				
		
		     
	   

		    
	

