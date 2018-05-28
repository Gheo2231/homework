/*Write a program that accepts three integers from the user and return true if the second number
is greater than the first number and third number is greater than second number.
Consider also a condition which if it is true, the second number does not need to be greater than first number.*/

import java.util.Scanner;
public class Homework_8{
    public static void main(String[] args){
        Scanner keyboardScan = new Scanner(System.in);

        System.out.println("Provide 3 numbers: ");
        int a = keyboardScan.nextInt();
        int b = keyboardScan.nextInt();
        int c = keyboardScan.nextInt();

        if (b>a || c>b){
            System.out.println("True.\nOk... Now look for the truth.");
        }
        else {
            System.out.print("Nothing happened, right? #HiHi");
        }
    }
}
