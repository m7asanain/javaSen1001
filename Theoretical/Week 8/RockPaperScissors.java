package week8_sec2;

import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int userScore = 0, compScore = 0, counter = 0;
		String rock = "rock", paper = "paper", scissors = "scissors";
		
		
		while (true) {
			
		    System.out.println("Paper/Rock/Scissors?");
		    String userChoise = input.nextLine();
		    String computerChoise = generateComputerChoice();
		    System.out.println("Computer picks: " + computerChoise);
		    
		    if (userChoise.equals(computerChoise)) {
		    	System.out.println("No One Won - Tie!");
		    } else if (userChoise.equals(paper) && computerChoise.equals(rock) || 
		    		userChoise.equals(scissors) && computerChoise.equals(paper) || 
		    		userChoise.equals(rock) && computerChoise.equals(scissors)) {
		    	System.out.println("User Won!");
		    	userScore++;
		    } else if (userChoise.equals(rock) && computerChoise.equals(paper) || 
		    		userChoise.equals(paper) && computerChoise.equals(scissors) || 
		    		userChoise.equals(scissors) && computerChoise.equals(rock)) {
		    	System.out.println("Computer Won!");
		    	userScore++;
		    }
		    
		    System.out.println("YOU:" + userScore + "\tCOMPUTER:" + compScore);
			if(userScore == 3 || compScore == 3)
				break;
			}
		
			if (userScore > compScore) {
				System.out.println("YOU WON");
			} else {
				System.out.println("COMPUTER WON");
			}
			
	}
	
	public static String generateComputerChoice() {
		
		String rock = "rock", paper = "paper", scissors = "scissors";
		
		int choice = RandomGeneration.generateRandom(3, 1);
		
		if (choice == 1) {
			return rock;
		} else if(choice == 2) {
			return paper;
		} else {
			return scissors;
		}
		
	}

}
