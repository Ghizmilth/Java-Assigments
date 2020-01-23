/**
Program created and submitted by Hidaner Ferrer

The purpose of this program is to use OOP to create a program that receives
user input for names and scores to then be organized by value from higher
to lower and print it on screen.
*/


import java.util.Scanner;
import java.util.Arrays;


public class HighScoresProgram
{

  public static void main (String[] args)
  {
    final int NUM_SCORES = 5;
    HighScores[] scores = new HighScores[NUM_SCORES];

    initialize(scores);
    sort(scores);
    display(scores);

  }


  public static void initialize(HighScores[] scores)
  {
    Scanner scoreInput = new Scanner(System.in); // Scanner to receive integer inputs from user
    Scanner nameInput = new Scanner(System.in); // Scanner to receive string inouts from user
    String name;
    int score;
    // For loop to ask user to input names and scores
    for(int i = 0; i < scores.length; i++)
    {
      System.out.print("Enter the name for score #"+(i+1)+": ");
      name = nameInput.nextLine(); // Adds element to the variable 'name'
      System.out.print("Enter the score for score #"+(i+1)+": ");
      while(!scoreInput.hasNextInt())     // While loop to check if the input is valid integers
      {
        scoreInput.next(); // Checks for the next input using scanner
        System.out.print("Please enter a valid numeric value: ");
      }
      score = scoreInput.nextInt();

      scores[i] = new HighScores(name, score); // Adds element to score array if the elemtn is valid
    }

  }


  //METHOD TO SORT THE ARRAY OF OBJECTS BASED ON SCORE VALUE
  public static void sort(HighScores[] scores)
  {
    HighScores tempHold = null; //Variable to hold temporary objects from array

    //For loop to iterate through objects and organize by value of scores
    for(int i = 0; i < scores.length; i++){
        HighScores temp1 = scores[i]; // Hold a temporary value of object based on index

        //For loop to compare item by item with outter loop
        for(int j = i+1; j < scores.length; j++){
            HighScores temp2 = scores[j];

            if(temp1.getScore() < temp2.getScore()){ //Condition to check if element[i] is bigger than element[j]
                tempHold = scores[i];
                scores[i] = scores[j];
                scores[j] = tempHold;
            }
        }
    }
  }

  //METHOD TO DISPLAY THE RESULTS OF THE SCORES
  public static void display(HighScores[] scores)
  {
    System.out.println("Top scorers:");

    //For loop to print the top scores on screen
    for(int i = 0; i < scores.length; i++)
    {
      System.out.println(scores[i].getName()+": "+scores[i].getScore());
    }
  }
}
