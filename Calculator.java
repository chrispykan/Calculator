import java.util.*;

public class Calculator{
   public static void main (String[] args){
   
      //scanner from java util package to let user input data
      Scanner scan = new Scanner(System.in);
      //user inputs first integer after system prompt
      System.out.println("\nCalculate any two numbers you want!\n\nEnter first number: ");
      int num1 = scan.nextInt();
      //user inputs second integer after system prompt
      System.out.println("Enter second number: ");
      int num2 = scan.nextInt();
      //defining operations calculator can perform 
      int a, s, d, m;
      a = num1 + num2;
      s = num1 - num2;
      d = num1 / num2;
      m = num1 * num2;
      //System prompts user to select operation to be performed to the numbers user inputted
      System.out.println( "Do you want to [A] add, [S] subtract, [D] divide or [M] multiply?\n[Q] Quit");
      //user selects operation from options in previous prompt (string)
      String operation = scan.next();
   
      //logic according to user's selected operation
      if(operation.equals("A")){
         System.out.println( num1 + " + " + num2 + " = " + a);
      }
      else if(operation.equals("S")){
         System.out.println( num1 + " - " + num2 + " = " + s);
      }
      else if(operation.equals("D")){
         System.out.println( num1 + " / " + num2 + " = " + d);
      }
      else{
         System.out.println( num1 + " * " + num2 + " = " + m);
      }
   }
}