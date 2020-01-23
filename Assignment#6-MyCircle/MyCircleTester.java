/**
  Assigment # 6 - Submitted by HIDANER FERRER
*/

import java.util.Scanner;

// Declaration of our public class
public class MyCircleTester
{

  // MAIN METHOD OF OUR PROGRAM CIRCLE TESTER
  public static void main(String[] args)
  {


    MyCircle[] circles = new MyCircle[3]; // Array of circles with 3 elements
    double radius, x, y; // Declaration of variables of type Double (X and Y store coordinates of circrles)
    Scanner userInput = new Scanner(System.in); // Creation of a Scaner object for user input

    System.out.println(); // Prints an empty line


    // FOR loop to get user inut for Circle coordinates and Radius
    for(int i = 0; i < circles.length; i++)
    {
      // Requests the value of the Radius of the circle
      System.out.print("Enter the value of the Radius for Circle #"+(i+1)+
                         " the input can contain decimals: ");

      while(!userInput.hasNextDouble()) // If input is not a number, then we ask for it to be entered again
      {
        userInput.next();
        System.out.print("Please enter a valid numeric value: ");
      }
      radius = userInput.nextDouble(); // sets Radius to the value of user input

      // Requests the value of the X axis of our circle
      System.out.print("Enter the value of the X axis coordinates for Circle #"+(i+1)+
                         " the input can contain decimals: ");
      while(!userInput.hasNextDouble()) // If input is not a number, then we ask for it to be entered again
      {
       userInput.next();
       System.out.print("Please enter a valid numeric value: ");
      }
      x = userInput.nextDouble(); // sets X to the value of user input

      // Requests the value of our Y axis of our circle
      System.out.print("Enter the value of the Y axis coordinates for Circle #"+(i+1)+
                         " the input can contain decimals: ");
      while(!userInput.hasNextDouble()) // If input is not a number, then we ask for it to be entered again
      {
        userInput.next();
        System.out.print("Please enter a valid numeric value: ");
      }
      y = userInput.nextDouble(); // sets Y to the value of user input

      circles[i] = new MyCircle(); // CReate an Object of MyCircle for every loop

      circles[i].setX(x); // Set X value for our circle object
      circles[i].setY(y); // Set Y value for our circle object
      circles[i].setRadius(radius); // Set Radius value for our circle object
    }

    System.out.println();

    // class ValidateInput
    // {
    //
    // }

    showAreas(circles); // Calls method to calculate and show the Area of the circles using the getArea() Method from MyCircle class

    testIfOverlap(circles); // Calls method to check if the circles overlap

    System.out.println(); // Prints empty line

  }


  // METHOD TO SHOW AREAS OF THE CIRCLES
  public static void showAreas(MyCircle[] circArray)
  {
    System.out.println("The area of the circles are: ");

    // Iteration of every element of the array to get the area in the getArea() Method of the MyCircle instance
    for(int i = 0; i < circArray.length; i++)
    {
      System.out.printf("Area of Circle " + (i+1) + " = %.2f \n", circArray[i].getArea());
    }

  }


  // METHOD TO CHECK IF CIRCLES OVERLAP
  public static void testIfOverlap(MyCircle[] circArray)
  {
    int count = 0; // Counter to use as reference if no circles overlap

    // For loop to compare two circles and determine if they overlap or not
    for(int i = 0; i < circArray.length-1; i++ )
    {
      for(int j = i+1; j < circArray.length; j++)
      {
        if(!circArray[i].doesOverlap(circArray[j]))
        {
          count++;
        } else
        {
          System.out.println("Circle " + (i+1) + " overlaps with Circle " + (j+1));
        }
      }
    }

    // If counter equals 3, then no circles overlap
    if(count == 3)
    {
      System.out.println("No circles overlap.");
    }
  }

}
