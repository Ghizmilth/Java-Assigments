// import java.util.Scanner;
//
// //Hidaner Ferrer
//
// public class Asterisks {
//   public static void main(String[] args)
//   {
//     int count;
//     char goAgain = 'y';
//     Scanner input = new Scanner(System.in);
//
//     while (goAgain != 'n')
//     {
//       System.out.print("How many asterisks?: ");
//       count = input.nextInt();
//
//       for (int i = 0; i<count; i++)
//       {
//         System.out.print("*");
//       }
//
//       System.out.println();
//       System.out.print("Go again? (y/n): ");
//
//       goAgain = input.next().charAt(0);
//     }
//   }
// }

import java.util.Random;

// import java.util.Scanner;

public class Asterisks {
  public static void main(String[] args){
    int a = 30;
    int b = 70;
    int guessedNumber = 0;
    Random randomVal = new Random();

    if(guessedNumber == 0){
      guessedNumber = randomVal.nextInt(a+1) + (b-a-1);
    }

    System.out.println(guessedNumber);

    System.out.println(guessedNumber);


//     int k;
//     double total;
//
//     // System.out.print("Enter a value: ");
//     // int userValue = stdin.nextInt();
//
// while(userValue>=0)
//     {
//         if(userValue>100)
//             {
//             System.out.print(userValue+" ");
//             System.out.println("Enter a new value: ");
//             userValue = stdin.nextInt();
//
//             }
//         else if (userValue<100)
//             {
//                 System.out.println("Enter a new value: ");
//                 userValue = stdin.nextInt();
//             }
//         else
//             {
//             System.out.print("The value is not positive");
//             }
// }

  }
}
