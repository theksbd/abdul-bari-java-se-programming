import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Method 1
        System.out.print("Enter the height of your triangle: ");
        int height = scanner.nextInt();
        System.out.print("Enter the base of your triangle: ");
        int base = scanner.nextInt();

        double area1 = (height * base) / 2.0;
        System.out.println("The area of your triangle is: " + area1);

        // Method 2
        System.out.print("Enter the first edge: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second edge: ");
        int b = scanner.nextInt();
        System.out.print("Enter the third edge: ");
        int c = scanner.nextInt();

        double s = (a + b + c) / 2.0;
        double area2 = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("The area of your triangle is: " + area2);
    }
}