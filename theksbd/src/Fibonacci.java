import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = scanner.nextInt();

        if (n == 0) {
            System.out.println("0");
        }
        else if (n == 1) {
            System.out.println("1");
        }
        else {
            int f1 = 0;
            int f2 = 1;
            int f3 = f1 + f2;
            int i = 2;
            while (i < n) {
                f3 = f1 + f2;
                f1 = f2;
                f2 = f3;
                i++;
            }
            System.out.println(f3);
        }
    }
}
