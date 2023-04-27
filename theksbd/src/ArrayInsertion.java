import java.util.Scanner;

public class ArrayInsertion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = { 1, 2, 3, 4, 5 };

        System.out.print("Enter the value to insert: ");
        int value = scanner.nextInt();
        System.out.print("Where to insert: ");
        int index = scanner.nextInt();

        int[] newArr = new int[arr.length + 1];

        if (index < 0 || index > arr.length) {
            System.out.println("Index is out of range!!!");
        }
        else {
            for (int i = 0; i < index; i++) {
                newArr[i] = arr[i];
            }
            newArr[index] = value;
            for (int i = index; i < arr.length; i++) {
                newArr[i + 1] = arr[i];
            }
        }

        for (int x : newArr) {
            System.out.print(x + " ");
        }
    }
}
