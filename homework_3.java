/*Write a program that calculates the number of milliseconds contained in
X hours 
Y minutes
Z seconds, where X, Y and Z are inputs introduced by the user. 
(check that Y < 60, Z < 60, and both >= 0)*/

import java.util.Scanner;

public class homework_3 {
        public static void main (String[] args) {
        Scanner keyboardScan = new Scanner(System.in);
        
          System.out.print("Give a number of hours that you want to convert in miliseconds: ");
          int X = keyboardScan.nextInt();
          
          System.out.print("..now some minutes: ");
          int Y = keyboardScan.nextInt();
          
          System.out.print(" and seconds: ");
          int Z = keyboardScan.nextInt();
      
            int msX = (X * 3600) * 1000;
            int msY = (Y * 60) * 1000;
            int msZ = Z * 1000;
            int msAll = msX+msY+msZ;

            boolean Zok = Z < 60;
            boolean Yok = Y < 60;

            //How can i put both to be checked for true, e.g.: boolean bothOk=(Z,Y) <=0 ; ?
            boolean zOk = Y>=0;
            boolean yOk = Z>=0;
            boolean bothOk = zOk && yOk;

            System.out.println(Yok && Zok && bothOk ? "X converted to miliseconds is: "+msX+", Y equals to: "+msY+
                    ", Z is "+msZ+" and total given time converted to miliseconds is: "+msAll+"." : "Please check the data you provided");
        }
    }
