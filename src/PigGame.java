import java.util.Random;
import java.util.Scanner;

public class PigGame {

	 public static void main(String[] args)
	 {
	 int turnScore = 0;
	 int totalScore = 0;
	 int turnScore2 = 0;
	 int totalScore2 = 0;
	 final int WIN = 20;
	 int dice = 0;
	 int dice2 = 0;
	 String input = "r";
	 String input2 = "r";
	 char repeat;

	 Scanner keyboard = new Scanner(System.in);
	 Scanner s = new Scanner (System.in);

	 Random randomNumbers = new Random();

	 while(totalScore < WIN && totalScore2 < WIN)
	 {
	 //Player 1's turn

	 do
	  {
	      dice = randomNumbers.nextInt(6) + 1;
	      System.out.println();
	      System.out.println("You rolled: " + dice);

	           if(dice == 1)
	           {
	               turnScore = 0;
	               System.out.println("Turn over.");
	               System.out.println("Player 1 total is " + totalScore);
	               break;
	           }
	           else
	           {         
	              turnScore += dice;
	              System.out.print("Player 1 turn total is " + turnScore + " ");
	              System.out.print("Enter (r)oll or (s)top: ");
	              input = keyboard.nextLine();
	              repeat = input.charAt(0);


	         if(repeat == 's')
	         {
	         System.out.println("Turn over.");
	         System.out.print("Current score: Player 1 has " + totalScore);
	         System.out.println(", Player 2 has " + totalScore2);
	         break;

	         }
	      }
	  }
	 while(input.equalsIgnoreCase("r") || dice != 1); 
	 {             

	     totalScore += turnScore;
	 }

	  if(totalScore >= WIN)
	  {
	      System.out.println("Your total Score is " + totalScore);
	      System.out.println("Player 1 wins!");

	  }


	  //player2's turn
	  System.out.println();
	  System.out.println("It is Player 2's turn.");

	 { do
	  {
	      dice2 = randomNumbers.nextInt(6) + 1; 
	      System.out.println("Player 2 rolled: " + dice2);

	      if(dice2 == 1)
	        {
	          turnScore2 = 0;
	          System.out.print("Turn over");
	          System.out.println("Player 2 total is " + totalScore2);
	          break;             
	        }
	      else
	      {
	      turnScore2 += dice2;
	      System.out.print("Player 2 total is " +turnScore2 + " ");
	      System.out.print("Enter (r)oll or (s)top: ");
	      input = keyboard.nextLine();
	      repeat = input.charAt(0);


	    if(repeat == 's')
	        {
	    System.out.println("Turn over");
	    System.out.print("Current score: Player 1 has " + totalScore);
	    System.out.println(", Player 2 has " + totalScore2);
	    break;
	        }
	    }
	}  
	while(input2.equalsIgnoreCase("r") && dice != 1); {

	    totalScore2 += turnScore2;

	      }
	 }
	if(totalScore2 >= WIN);
	  {
	      System.out.println("Player 2 score is " + totalScore2 + "\n");
	      System.out.println("Player 2 wins");
	      break;
	  }
	  
	 } 
	 }
} 
	  
	  
	  
	  
	 