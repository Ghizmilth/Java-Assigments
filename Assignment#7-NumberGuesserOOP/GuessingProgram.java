import java.util.Scanner;

/** Program written by Hidaner Ferrer

This is a program that can figure out a number chosen by a human user.
The user will think of a number between 1 and 100 and the program will make
guesses and the user will tell the program to guess Higher or Lower until
the number matches the guess.

*/

public class GuessingProgram
{

  public static Scanner userInput = new Scanner(System.in); // Globalc variable of a Scanner object;
  public static NumberGuesser guessNumber = new NumberGuesser(1, 125); //CREATES AN INSTANCE OF A NUMBER GUESER GAME OBJECT

// MAIN METHOD TO START THE GAME
  public static void main(String[] args)
  {

    // The game continues until the player doesn't want to play again (false)
    do {
      guessNumber.reset(); //Resets the state of the class
      playOneGame(); //Calls method to show sequence of the game to user
    } while(shouldPlayAgain()); //Boolean Method to check with user if they

    System.out.println();
    System.out.println("Good bye!");
    System.out.println();
  }

//METHOD THAT EXECUTES A COMPLETE GUESSING GAME
  public static void playOneGame()
  {
    char userResponse = 'h'; //User response store variable
    int guess; // Value of the guess number returned by the program;


    System.out.println();
    System.out.println("Think of a number between "+ guessNumber.getLowRange() +" and "+ guessNumber.getUpperRange()); //Prints the message to start the game

    //While the user answer is not 'c' we continue running the game
    while (userResponse != 'c'){

      guess = guessNumber.getCurrentGuess(); //We call this method to calculate our first guess
      userResponse = getUserResponseToGuess(guess); //Store the user's answer of 'h', 'l' or 'c'

      if(userResponse == 'h'){
        guessNumber.higher(); // if answer is 'h' We add 1 to the mid point and store it Min
      }
      if(userResponse == 'l'){
        guessNumber.lower(); //If answer is 'l' we replace Max value by our mid point
      }
      if(userResponse == 'c'){
        System.out.println("You picked "+guess+"? Great pick!");
      }
    }
  }

  public static char getUserResponseToGuess(int num){
    String userAnswer; //Stores user anser og 'h', 'l' or 'c'
    char answerChar; //Stores the character of the user answer

    System.out.printf("Is it "+num+"? (h/l/c): ");
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
