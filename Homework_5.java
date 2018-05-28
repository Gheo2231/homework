/* Write a program that converts the height of a person from feet and inches (e.g 5 feet 10 inches) to centimeters (178cm).
The value should be integer. To convert a double value to an integer,
you can use the cast operator: double d = 33.4; int i = (int)d; // i will be 33; */

public class Homework_5 {
    public static void main(String[] args) {

//first option, on short

        double imperial = 6.4;
        double imperial2metricValue = 3.28;
        double metric = imperial / imperial2metricValue;
        double centimetersDouble = metric * 100;
        int centimeter = (int) centimetersDouble;

        System.out.printf("You are %d centimeters tall.", centimeter);

    }
}

