import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        System.out.print("Enter how many times you want to rotate: ");
        int k = scanner.nextInt();

        // Suppose array.length is 5, so if we rotate 3 times, the result will be the same
        // as we rotate 8 times, 13 times, 18 times,...
        // So we should generalize k by using % operator
        k %= array.length;

        int[] rotatedArray = new int[array.length];

        if(k > 0) {
            // We divide the array into 2 parts, the rotated part (right part) with length of k and
            // the original part (left part) with length of array.length - k

            // Fill in the rotated part
            for(int i = 0; i < k; i++) {
                rotatedArray[i] = array[array.length - k + i];
            }
            // Fill in the original part
            for(int i = 0; i < array.length - k; i++) {
                rotatedArray[i + k] = array[i];
            }
        }
        else {
            rotatedArray = array;
        }

        System.out.println("Before rotation:");
        for(int x : array) {
            System.out.print(x + " ");
        }

        System.out.println("\nAfter rotation:");
        for(int x : rotatedArray) {
            System.out.print(x + " ");
        }
    }
}
