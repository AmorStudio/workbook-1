package org.example;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {



     Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the secound number");
        int secoundNumber = scanner.nextInt();
        System.out.println("possible calculations: ");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");
        System.out.println("Enter the value based on given prompt for calculation: ");

        char UserInput = scanner.next().charAt(0);
        int answer;

        if(UserInput == 'A')

        {
          //Do addition

           answer = firstNumber + secoundNumber;
        }
        else if (UserInput == 's')
        {
          // Subtract
          answer = firstNumber - secoundNumber;
        }
        else if (UserInput == 'M')
        {
          //Do multiplication
          answer = firstNumber * secoundNumber;
        }
       else

        answer = secoundNumber/firstNumber;

              System.out.println("After calculation, your answer is : " + answer ); */


    }
}