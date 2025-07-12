import java.util.Scanner;

public class SimpleCalculator {

    // Function for addition
    static int add(int a, int b) {
        return a + b;
    }

    // Function for subtraction
    static int subtract(int a, int b) {
        return a - b;
    }

    // Function for multiplication
    static int multiply(int a, int b) {
        return a * b;
    }

    // Function for division
    static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero!");
            return 0;
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int x = sc.nextInt();

        System.out.print("Enter second number: ");
        int y = sc.nextInt();

        System.out.println("Addition: " + add(x, y));
        System.out.println("Subtraction: " + subtract(x, y));
        System.out.println("Multiplication: " + multiply(x, y));
        System.out.println("Division: " + divide(x, y));
    }
}
