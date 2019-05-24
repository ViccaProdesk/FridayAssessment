package QAassessment.Friday;

import java.util.Scanner;

public class Game {
	Scanner sc = new Scanner(System.in);


private static final boolean True = true;
private static final boolean False = false;

public static void main(String[]args) {
	
}
	
	int count = 0;
	public boolean myGame = True;
	do {
		System.out.println("Alive and can still play");
		if (count > 50)  //after 50 turns, if player haven't find the treasure he dies from hunger
			myGame = true;
		else (!isAlive()) { // if not 50 yet he is alive
			myGame = false;
	
	}while (myGame);
	System.out.println("Dead and cannot play anymore");
	
		}
		Scanner scanner = new Scanner(System.in);
	public String input = ("West");
	do {
		System.out.println("The watch showed the right as you go West you see more light and a compleatly different environment");
	}
	 
	 

}
}

	

