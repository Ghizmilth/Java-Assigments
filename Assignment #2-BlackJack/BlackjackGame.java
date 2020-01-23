import java.util.Scanner;
import java.util.Random;

public class BlackjackGame
{
  public static void main(String[] args)
  {

  int randomCard1; // card #1
  int randomCard2; // card #2
  int total;// Total sum of cards
  int randomCard3; // Card that is to be served to player
  char playAgain = 'n';
  char newCard= 'n'; // To hold a 'Y' or a 'N'
  String input; // To read user inputCookies


  // Creates a Scanner new object
  Scanner keyboard = new Scanner(System.in);

  // Creates a new Random object
  Random randomValue = new Random();

do {
  randomCard1 = randomValue.nextInt(10)+1; // Generates card#1
  randomCard2 = randomValue.nextInt(10)+1; //Generates card#2
  total = randomCard1 + randomCard2; // Adds the value of the first cards on the table
  System.out.println("First cards: "+randomCard1+", "+randomCard2);
  System.out.println("Total: "+total);

  while(total<21){
      System.out.print("Do you want another card? (y/n): ");
      input = keyboard.nextLine(); //Read a Line
      newCard = input.charAt(0); // Get first char for an answer

      if(newCard == 'y') {
        randomCard3 = randomValue.nextInt(10)+1;
        total = total+randomCard3;
        System.out.println("Total: "+total);
      } else {
        total = 22;
      }
    }

    System.out.print("Would you like to play again? (y/n): ");
    input = keyboard.nextLine();
    playAgain = input.charAt(0);
    System.out.println();

} while (playAgain == 'y' || playAgain == 'Y');

  }

}
