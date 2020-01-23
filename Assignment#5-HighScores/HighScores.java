/**
Assignment created and submitted by Hidaner Ferrer
*/


import java.util.ArrayList;
import java.util.Scanner;


public class HighScores
{

  // Main method to start create ArrayLists and call helper methods
  public static void main(String[] args)
  {

    ArrayList<Integer> scores = new ArrayList<Integer>(); // Creates an ArrayList to hold scores
    ArrayList<String> names = new ArrayList<String>(); // Creates an ArrayList to hold names

    initialize(names, scores); // Call method to initialize arrays, passes ArrayLists as arguments
    sort(names, scores); // Call method to sort the data input by user
    display(names, scores); // Call method to display data to user

  }

  // METHOD TO INITIALIZE THE ARRAYS USING THE USER'S INPUT
  public static void initialize(ArrayList<String> names, ArrayList<Integer> scores)
  {
    Scanner scoreInput = new Scanner(System.in); // Scanner to receive integer inputs from user
    Scanner namesInput = new Scanner(System.in); // Scanner to receive string inouts from user

    // For loop to ask user to input names and scores
    for(int i = 0; i < 5; i++)
    {
      System.out.print("Enter the name for score #"+(i+1)+": ");
      names.add(i, namesInput.nextLine()); // Adds element to the Names Array
      System.out.print("Enter the score for score #"+(i+1)+": ");
      while(!scoreInput.hasNextInt())     // While loop to check if the input is valid integers
      {
        scoreInput.next(); // Checks for the next input using scanner
        System.out.print("Please enter a valid numeric value: ");
      }
      scores.add(i, scoreInput.nextInt()); // Adds element to score array if the elemtn is valid
    }

  }

  // METHOD TO SORT ARRAY ELEMENTS FROM HIGHER TO LOWER SCORE VALUES
  public static void sort(ArrayList<String> names, ArrayList<Integer> scores)
  {
    int startScan, index, maxIndex, maxValue; // Declare variables
    String maxStrValue, maxStrIndex;

    // Use Selection Sort Algorithm to organize scores from higher to lower
    for(startScan = 0; startScan < scores.size(); startScan++)
    {
      maxIndex = startScan;
      maxValue = scores.get(startScan);
      maxStrValue = names.get(startScan);

      for(index = startScan + 1; index < scores.size(); index++)
      {
        if(scores.get(index) > maxValue) // Checks if a value is bigger than the other
        {
          maxValue = scores.get(index);
          maxStrValue = names.get(index);
          maxIndex = index;
        }
      }

      /** If value has been confirmed to be bigger than the other,
      then we change Score and Names simultaneously
      */

      scores.set(maxIndex, scores.get(startScan));
      names.set(maxIndex, names.get(startScan));
      scores.set(startScan, maxValue);
      names.set(startScan, maxStrValue);
    }
  }

    // METHOD TO DISPLAY THE VALUES OF THE ARRAYS ON SCREEN TO THE USER
    public static void display(ArrayList<String> names, ArrayList<Integer> scores)
    {
        System.out.println("Top Scorers:");
        for(int i=0; i<names.size(); i++)
        {
          System.out.println(names.get(i)+": "+scores.get(i));
        }
    }


}
