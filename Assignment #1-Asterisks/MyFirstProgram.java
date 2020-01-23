//This is my first Java program.

// public class MyFirstProgram
// {
//   public static void main(String[] args)
//   {
//     System.out.print("Success\n");
//     System.out.print("Success ");
//     System.out.print("Success\n");
//   }
// }


//
// public class MyFirstProgram
// {
//      public static void main(String[] args)
//      {
//        double number = 17;
//
//         System.out.println(number%2);
//         System.out.print("32Juanita Way\n");
//         System.out.println("San Francisco, CA\' 94127");
//         System.out.println("510-340-8335");
//       }
// }


import javax.swing.JOptionPane;

public class MyFirstProgram {
    public static void main(String[] args){
        //Declare variables

        String inputCookies; //For readying input
        int cookies, totalCalories; //
        final int CALORIES = 300;
        final int SERVING_SIZE = 4;

        //Get the amount of coockiesEnter number of cookies eaten:");
        inputCookies = JOptionPane.showInputDialog("Enter number of cookies eaten: ");

        //Convert the input to an integer
        cookies = Integer.parseInt(inputCookies);

        //Calculate total calories
        totalCalories = (cookies*CALORIES)/SERVING_SIZE;

        JOptionPane.showMessageDialog(null, "Your calorie intake was: "+
                        totalCalories +
                        " calories.");

        System.exit(0);
    }
}
