/**
  Program created and submitted by HIDANER FERRER
  November 11, 2019
*/


import java.util.Scanner;


public class StringProcessorProgram
{

  //PUBLIC STATIC GLOBAL VARIABLES
  public static String userInput;
  public static StringProcessor stringToProcess = new StringProcessor();
  public static Scanner keyboard = new Scanner(System.in);

  //MAIN METHOD OF THE PROGRAM
  public static void main(String[] args)
  {

    //Repeat this program until user says "No"
    do {
      askForString();
      sayNumberOfWords();
      countUpperCase();
      countDigits();
      countDigitWords();
      getStringNoSpace();
      getStringNoVowels();
      getStringNoDigits();
    } while(shouldEnterNewString()); //Boolean Mthod to check if user wants to enter string again

  }

  //METHOD TO ASK USER TO INPUT STRING
  public static void askForString()
  {
    System.out.print("Enter a line of text:");
    userInput = keyboard.nextLine(); //Receives the user's keyboard input

    stringToProcess = new StringProcessor(userInput); //Creates a new instance of our object StringProcessor

  }

  //METHOD TO SHOW STRING NUMER OF WORDS
  public static void sayNumberOfWords()
  {
    System.out.println("Words: " + stringToProcess.wordCount());
  }

  //METHOD TO SHOW NUMBER OF UPPERCASE LETTERS IN STRING
  public static void countUpperCase()
  {
    System.out.println("upperCase: " + stringToProcess.upperCaseCount());
  }

  //METHOD TO SHOW NUMBER OF DIGITS IN STRING
  public static void countDigits()
  {
    System.out.println("digits: " + stringToProcess.digitCount());
  }

  //METHOD TO SHOW NUMBER OF DIGIT WORDS IN STRING
  public static void countDigitWords()
  {
    System.out.println("digit words: " + stringToProcess.digitWordCount());
  }

  //METHOD TO SHOW STRING WITH NO WHITESPACES
  public static void getStringNoSpace()
  {
    System.out.println("line with whitespace removed: " + stringToProcess.getNoSpaceString());
  }

  //METHOD TO SHOW STRING WITH NO VOWELS
  public static void getStringNoVowels()
  {
    System.out.println("line with vowels replaced: " + stringToProcess.getNoVowelString());
  }

  //METHOD TO SHOW STRING WITH DIGIT WORDS REPLACED WITH ACTUAL DIGITS
  public static void getStringNoDigits()
  {
    System.out.println("line with digital words replaced: " + stringToProcess.getNoDigitWordString());
  }

  //METHOD TO CHECK IF USER WANTS TO TYPE A NEW STRING AGAIN
  public static Boolean shouldEnterNewString() {
      String userPlayAgain; //Stores user's answer 'y' or 'n'
      char playAgain; //Stores the character of the input answer

      System.out.print("Do you want to enter another one? (y/n): "); //Asks if user wants to play again
      userPlayAgain = keyboard.nextLine(); //Store user's answer
      playAgain = userPlayAgain.charAt(0); //Stores the character of user's answer

      //Anazlises if user's answer is 'y' returns TRUE, if 'n', retunrs FALSE
      if(playAgain == 'y' || playAgain == 'Y')
        return true;
      else
        return false;
    }

}
