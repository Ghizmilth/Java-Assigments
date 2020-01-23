import java.util.Scanner;

/** Program written by Hidaner Ferrer

This is a program that can figure out a number chosen by a human user.
The user will think of a number between 1 and 100 and the program will make
guesses and the user will tell the program to guess Higher or Lower until
the number matches the guess.

*/

public class NumberGuesser {

  public static Scanner userInput = new Scanner(System.in);
  // This is a main method to start the game
  public static void main(String[] args){

    // The game continues until the player doesn't want to play again (false)
    do {
      playOneGame(); //Calls method to show sequence of the game to user
    } while(shouldPlayAgain()); //Boolean Method to check with user if they

    System.out.println();
    System.out.println("Thank you for playing!");
    System.out.println();

  }

  //Function that executes a complete guessing name
  public static void playOneGame(){

    int min = 1; //Min value initialized of the range
    int max = 100; //Max value initialized of the range
    int guessNumber; //Value of the guess number returned by the program
    char userResponse = 'h'; //User response 'h','l' or 'c' (High, Low, Correct)

    System.out.println();
    System.out.println("Welcome to the \"Number Guesser\" game.");
    System.out.println("Please, guess a number between 1 and 100"); //Prints the message to start the game

    //While the user answer is not 'c' we continue running the game
    while (userResponse != 'c'){

      guessNumber = getMidPoint(min, max); //We call this method to calculate our first guess
      userResponse = getUserResponseToGuess(guessNumber); //Store the user's answer of 'h', 'l' or 'c'

      if(userResponse == 'h'){
        min = guessNumber+1; // if answer is 'h' We add 1 to the mid point and store it Min
      }
      if(userResponse == 'l'){
        max = guessNumber; //If answer is 'l' we replace Max value by our mid point
      }

    }

  }

//This function calculates the midpoint between in the rgiven range
  public static int getMidPoint(int low, int high){
    int midPoint = (int)((low+high)/2); //Stores value of midpoint of range

    return midPoint; //Returns the value of our range guess
  }

//Gets user response to the guessed number
  public static char getUserResponseToGuess(int guess){
    String userAnswer; //Stores user anser og 'h', 'l' or 'c'
    char answerChar; //Stores the character of the user answer

    System.out.printf("Is it "+guess+"? (h/l/c): ");
    userAnswer = userInput.nextLine(); //Reads answer from keyboard
    answerChar = userAnswer.charAt(0); //Stores character of our keyboard input answer

    return answerChar; //Returns the character with the answer
  }


//Method to asks if player wants to play again
  public static Boolean shouldPlayAgain() {
    String userPlayAgain; //Stores user's answer 'y' or 'n'
    char playAgain; //Stores the character of the input answer


    System.out.print("Great! Do you want to play again? (y/n): "); //Asks if user wants to play again
    userPlayAgain = userInput.nextLine(); //Store user's answer
    playAgain = userPlayAgain.charAt(0); //Stores the character of user's answer

    //Anazlises if user's answer is 'y' returns TRUE, if 'n', retunrs FALSE
    if(playAgain == 'y' || playAgain == 'Y')
      return true;
    else
      return false;
  }

}
