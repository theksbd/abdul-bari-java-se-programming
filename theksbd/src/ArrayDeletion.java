import java.util.Scanner;

public class ArrayDeletion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = { 1, 2, 3, 4, 5 };

        System.out.print("Enter the index where you want to delete: ");
        int index = scanner.nextInt();

        int[] newArr = new int[arr.length - 1];

        if (index < 0 || index >= arr.length) {
            System.out.println("Index is out of range!!!");
        }
        else {
            int j = 0;
            for (int i = 0; i < arr.length; i++) {
                if (i == index) {
                    j = 1;
                    continue;
                }
                newArr[i - j] = arr[i];
            }
        }

        for (int x : newArr) {
            System.out.print(x + " ");
        }
    }
}
