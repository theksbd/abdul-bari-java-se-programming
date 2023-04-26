import java.util.Scanner;

public class NumberToWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        String numberString = String.valueOf(number);

        for (int i = 0; i < numberString.length(); i++) {
            char digit = numberString.charAt(i);
            switch (digit) {
                case '0' -> System.out.print("Zero");
                case '1' -> System.out.print("One");
                case '2' -> System.out.print("Two");
                case '3' -> System.out.print("Three");
                case '4' -> System.out.print("Four");
                case '5' -> System.out.print("Five");
                case '6' -> System.out.print("Six");
                case '7' -> System.out.print("Seven");
                case '8' -> System.out.print("Eight");
                case '9' -> System.out.print("Nine");
                default -> System.out.print("Invalid number");
            }
        }
    }
}
