

public class Saturday_arrays {
    public static void main(String[] args) {
        int[] numbers = {8, 15, 20, 21, 22, 50, 70};
        int myNumber = 8;
        binarySearch(numbers, myNumber);

        int indexFound = binarySearch2(numbers, myNumber, 0, numbers.length-1);
        if (indexFound >= 0){
            System.out.println("Foundm " + indexFound);
        }
        else{
            System.out.println("Not found");
        }
    }

    private static void binarySearch(int[] numbers, int myNumber) {
        int left = 0;
        int right = numbers.length - 1;
        boolean found = false;
        while (left <= right) {
            int indexMiddle = (left + right) / 2;
            if (numbers[indexMiddle] == myNumber) {
                System.out.println("found in " + indexMiddle);
                found = true;
                break;
            } else if (numbers[indexMiddle] < myNumber) {
                left = indexMiddle + 1;
            } else if (numbers[indexMiddle] > myNumber) {
                right = indexMiddle - 1;
            }

        }
        if (!found) {
            System.out.print("not found");
        }
    }

    private static int binarySearch2(int[] numbers, int myNumber, int left, int right) {

        if (left <= right) {
            int indexMiddle = (left + right) / 2;
            if (numbers[indexMiddle] == myNumber) {
                return indexMiddle;
            }

            if (numbers[indexMiddle] < myNumber) {
               return binarySearch2(numbers, myNumber, indexMiddle+1, right);
            }else if (numbers[indexMiddle] > myNumber) {
                return binarySearch2(numbers, myNumber, left, indexMiddle-1);
            }

        }
        return -1;
    }
}
