// Submitted by Hidaner Ferrer

import java.util.Scanner;
import java.util.Arrays;


public class PokerHands {

  public static void main(String args[]){

    final int NUM_OF_CARDS = 5; // Number of cards that are accepted to be input
    int[] cards = new int[NUM_OF_CARDS]; // Array of cards

    //Create a Scanner object for keyboeard input
    Scanner keyboard = new Scanner(System.in);


/**
This is a section of the code to Ask
the user to input the vales of the cards for the game
with no faces, only cards 2-9
*/

    System.out.println("Enter five numeric cards, no face cars. Use 2 - 9.");

    // Get the value of card 1 to 5
    System.out.print("Card 1: ");
    cards[0] = keyboard.nextInt(); // Gets value of Card 1

    System.out.print("Card 2: ");
    cards[1] = keyboard.nextInt(); // Gets value of Card 1

    System.out.print("Card 3: ");
    cards[2] = keyboard.nextInt(); // Gets value of Card 1

    System.out.print("Card 4: ");
    cards[3] = keyboard.nextInt(); // Gets value of Card 1

    System.out.print("Card 5: ");
    cards[4] = keyboard.nextInt(); // Gets value of Card 1

    Arrays.sort(cards); // Sorts the array

/**
  This section executes the logic to ask if the user cards
  belong to a specific type of hand for Poker
*/

    if(containsFourOfAKind(cards)) {
      System.out.println("Four of a kind!");
    } else if(containsFullHouse(cards)) {
      System.out.println("Full house!");
    } else if(containsStraightHand(cards) == 5) {
      System.out.println("Straight!");
    } else if (threeOfAKind(cards) == 3) {
      System.out.println("Three of a kind!");
    } else if(containsTwoPair(cards) == "Pair") {
        System.out.println("Two Pair!");
    } else if(containsPair(cards) == 1) {
        System.out.println("Pair!");
    } else {
      System.out.println("High Card");
    }

  }


  // FUNCTION TO CHECK IF A HAND CONTAINS "FOUR OF A KIND"
  public static boolean containsFourOfAKind(int[] hand){
    int occurrence = 1; // Occurance of the repeated

    // Compare the values of the elements in the array and check if they are Four of a kind
    for (int i=0; i < hand.length-1; i++){
      // If Element i of the array is equals to element i+1
      if(hand[i] == hand[i+1]){
        occurrence++;
        if(occurrence == 4){ // If occurrence equals 4 cards as the same in the hand
          break;
        }
      } else {
        occurrence = 1;
      }
    }

    // If the occurence happens 4 times
    return occurrence == 4 ? true:false;
  }


  // FUNCTION TO CHECK IF A HAND CONTAINS "FULL HOUSE" (HAS A PAIR AND THREE OF A KIND)
  public static boolean containsFullHouse(int[] hand){

    int occurrence = 1; // Occurrence of repeated card
    int count1 = 0; // Holds teh count of the cards that are the same
    int count2 = 0; // Holds the count of the cards that are the same
    int loopCounter = 0; // HOlds the position of the loop on the array

    // Check each card to see which ones are repeated and store the count on count1
    for(int i = 0; i < hand.length-1; i++){
      if(hand[i] == hand[i+1]){
        occurrence++; // Holds the number of occurrences of the same card
      } else {
        count1 = occurrence; // If card is not the same we add 1 to the counter
        loopCounter = i; // Sets variable on the position of the loop in the array
        occurrence = 1; // Resets variable to 1
      }
    }

    // Check each card to see which ones are repeated and store the count on count2
    for(int j = loopCounter; j < hand.length-1; j++) {
      if(hand[j] == hand[j+1]){
        occurrence++; // Holds the number of occurrences of the same card
      } else {
        count2 = occurrence; // Sets value of count2 to the amount of occurrences of the same card
      }
    }

    // Return true is there are 2 of a kind and 3 of a kind in the hand
    return (count1 == 2 && count2 == 3 || count1 == 3 && count2 == 2) ? true : false;

  }


  // FUNCTION TO CHECK IF IT CONTAINS "STRAIGHT HAND"
  public static int containsStraightHand(int[] hand) {
    int lowerCard = hand[0]; // Holds the lower value of the cards
    int countCards = 1; // Counter of cards that are counted if they are in sequence of value

    for(int i=1; i < hand.length; i++){
      if(hand[i] == lowerCard+1){
        countCards++;
        lowerCard = hand[i];
      }

      if(countCards == 5){  // If count is 5 then we have 5 sequenced cards
        return countCards; // Returns 5 as value
      }
    }
    return countCards; // Returns any value stored on the variable at the end of the loop
  }


  // FUNCTION TO CHECK IF HAND CONTAINS "THREE OF A KIND"
  public static int threeOfAKind(int[] hand){
    int threeCards = 0; // Variable to store the number of cards that are the same
    int occurrence = 1; // Variable to hold the number of times a card is repeated

    // Checks if a card is repeated 3 times
    for(int i = 0; i < hand.length-1; i++){
      if(hand[i] == hand[i+1]){
        occurrence++;
        if(occurrence == 3){
            threeCards = occurrence;
        }
      } else {
         occurrence = 1;
        }
    }

    return threeCards == 3 ? 3 : 1; // return 3 is there are 3 cards of a kind

  }


  // FUNCTION TO CHECK IF HAND CONTAINS "TWO PAIRS"
  public static String containsTwoPair(int[] hand){
    int pairs = 0; // Variable to count the amount of pairs in the hand
    int occurrence = 1; // Variable to hold the number of times a card is repeated

    // Checks if there are two pairs of cards in the hand
    for(int i=0; i < hand.length-1; i++){
      if(hand[i] == hand[i+1]){
        occurrence++; // Adds 1 if the cards are the same
        pairs++; // If the cards are the same then we add 1 to Pair
      } else {
        continue;
      }
    }
    return (pairs == 2) ? "Pair":"No"; // Return a String that says Pair to confirm there are 2 pairs
    }


  // FUNCTION TO CHEKC IF HAND CONTAINS "PAIR"
  public static int containsPair(int[] hand){
    int pair = 0; // Variable to store if there is one pair present in the hand
    int occurrence = 1;

    for(int i=0; i < hand.length-1; i++){
      if(hand[i] == hand[i+1]){
        occurrence++; // Adds 1 if the cards are the same
        pair++; // If the card is repeated, it adds 1 to Pair
      } else {
        continue; // If
      }
    }

    return (pair == 1) ? 1:0;
    }

  }
// }
