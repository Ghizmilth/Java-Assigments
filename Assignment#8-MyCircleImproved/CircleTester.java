/**
  Assigment # 8 - Submitted and created by HIDANER FERRER
  Program that uses Aggregation, Multiple Constructors,
  Copy Constructors, toString Method and equals method.
*/

import java.util.Scanner;

// Declaration of our public class
public class CircleTester
{

  // MAIN METHOD OF OUR PROGRAM CIRCLE TESTER
  public static void main(String[] args)
  {

    Point[] points = new Point[3];
    Circle[] circles = new Circle[3]; // Array of circles with 3 elements
    Circle[] circlesThreeArgs = new Circle[3];
    Circle[] circlesObj = new Circle[3];
    double radius, x, y; // Declaration of variables of type Double (X and Y store coordinates of circrles)
    Scanner userInput = new Scanner(System.in); // Creation of a Scaner object for user input

    System.out.println(); // Prints an empty line

    // For loop to get user inut for Circle coordinates and Radius
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

      circles[i] = new Circle(); // CReate an Object of MyCircle for every loop
      points[i] = new Point(x, y); //Creates a Point object to send

      circles[i] = new Circle(points[i], radius); // Set Radius value for our circle object using Point Objects and radius

      circlesThreeArgs[i] = new Circle(x, y, radius); //Set circles with 3 arguments constructor

      circlesObj[i] = new Circle(circles[i]);
    }

    System.out.println();

    System.out.println();
    System.out.println("THIS SECTION ON, WAS CREATED USING CONSTRUCTOR Circle(Point o, radius)");
    System.out.println();

    showAreas(circles); // Calls method to calculate and show the Area of the circles using the getArea() Method from MyCircle class
    testIfOverlap(circles); // Calls method to check if the circles overlap
    testIfEquals(circles);

    System.out.println();
    System.out.println("THIS SECTION ON, WAS CREATED USING CONSTRUCTOR Circle(x, y, radius)");
    System.out.println();

    showAreas(circlesThreeArgs); // Calls method to calculate and show the Area of the circles using the getArea() Method from MyCircle class
    testIfOverlap(circlesThreeArgs); // Calls method to check if the circles overlap
    testIfEquals(circlesThreeArgs);

    System.out.println();
    System.out.println("THIS SECTION ON, WAS CREATED USING CONSTRUCTOR Circle(Circle c)");
    System.out.println();

    showAreas(circlesObj); // Calls method to calculate and show the Area of the circles using the getArea() Method from MyCircle class
    testIfOverlap(circlesObj); // Calls method to check if the circles overlap
    testIfEquals(circlesObj);

    System.out.println(); // Prints empty line

  }


  // METHOD TO SHOW AREAS OF THE CIRCLES
  public static void showAreas(Circle[] circArray)
  {
    System.out.println("The area of the circles are: ");

    // Iteration of every element of the array to get the area in the getArea() Method of the MyCircle instance
    for(int i = 0; i < circArray.length; i++)
    {
      System.out.printf("Area of Circle " + (i+1) + " = %.2f \n", circArray[i].getArea());
      System.out.println(circArray[i].toString());
    }

  }


  // METHOD TO CHECK IF CIRCLES OVERLAP
  public static void testIfOverlap(Circle[] circArray)
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
        }
        else
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
    else if(count == 0)
    {
      System.out.println("All circles overlap.");
    }

  }

  public static void testIfEquals(Circle[] circArray)
  {
    int count = 0; // Counter to use as reference if no circles overlap
    // For loop to compare two circles and determine if they overlap or not
    for(int i = 0; i < circArray.length-1; i++ )
    {
      for(int j = i+1; j < circArray.length; j++)
      {
        if(!circArray[i].equals(circArray[j]))
        {
          count++;
        }
        else
        {
          System.out.println("Circle " + (i+1) + " equals Circle " + (j+1));
        }
      }
    }

    // If counter equals 3, then no circles are equals
    if(count == 3)
    {
      System.out.println("No circles are equal.");
    }
    else if(count == 0)
    {
      System.out.println("All circles are equal.");
    }
  }

}
