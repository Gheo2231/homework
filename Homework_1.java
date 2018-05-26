/*Given three values representing the angles in a triangle, 
print if the triangle is right-angled or not (check if the triangle is a valid one)*/

public class Homework_1{
    public static void main(String[] args){

        int Side1, Side2, Side3, sumAngles;
        boolean rightAngle, firstSide, secondSide, thirdSide, triangleProof;

        Side1=90;
        Side2=20;
        Side3=80;

        sumAngles = (Side1+Side2+Side3);
        triangleProof = (sumAngles == 180);

        firstSide = (Side1==90);
        secondSide = (Side2==90);
        thirdSide = (Side3==90);

        rightAngle = (firstSide||secondSide||thirdSide||triangleProof);

        System.out.println(rightAngle && triangleProof ? "The triangle is right."
                            : "The triangle is not right or maybe isn't a triangle, please update the angles.");

    }
}
