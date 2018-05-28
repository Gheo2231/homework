//7. Write a program to accept a positive number, not bigger than 1000 and check that the number is even or not.
// Prints 1 if the number is even or 0 if the number is odd. (check if they did the check)
public class Homework_7{
    public static void main(String[] args){

        int number = 143;
        boolean numOk = number <= 1000 && number >=0;

        if (numOk==false) {
            System.out.println("Invalid number entered -> must be smaller than 1000 and bigger or equal to 0, " +
                    "please provide another number.");
            }
        else if ((number%2)==0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }

    }
}
