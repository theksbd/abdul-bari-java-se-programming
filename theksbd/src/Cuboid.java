import java.util.Scanner;

public class Cuboid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length: ");
        double length = scanner.nextDouble();
        System.out.print("Enter breadth: ");
        double breadth = scanner.nextDouble();
        System.out.print("Enter height: ");
        double height = scanner.nextDouble();

        double areaOfFloor = length * breadth;
        double areaOfFrontWall = length * height;
        double areaOfSideWall = breadth * height;
        double volume = length * breadth * height;

        System.out.println("Area of floor/cell: " + areaOfFloor);
        System.out.println("Area of front wall: " + areaOfFrontWall);
        System.out.println("Area of side wall: " + areaOfSideWall);
        System.out.println("Volume of cuboid: " + volume);
    }
}
