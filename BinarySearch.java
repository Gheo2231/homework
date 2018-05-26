//make a program that sorts the numbers in an array in ascending order

public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = {8, 15, 20, 21, 22, 50, 70};
        int myNumber = 8;
        binarySearch(numbers, myNumber);
    }

    private static void binarySearch(int[] numbers, int myNumber) {
        int left = 0;
        int right = numbers.length-1;
        boolean found = false;
        while (left <= right){
            int indexMiddle = (left+right)/2;
            if (numbers[indexMiddle] == myNumber){
                System.out.println("found "+ indexMiddle);
                found = true;
                break;
            }
            else if (numbers[indexMiddle] < myNumber ) {
                left = indexMiddle + 1;
            }
            else if(numbers[indexMiddle] > myNumber){
                right=indexMiddle-1;
                }

            }
        if (!found){
        System.out.print("not found");
    }
    }
}
