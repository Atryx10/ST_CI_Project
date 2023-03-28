package calc;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result;

        switch(operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Error: Invalid operator.");
                scanner.close();
                return;
        }

        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
        scanner.close();

    }

    public static double add(double a, double b)
    {
        return a+b;
    }

    public static double subtract(double a, double b)
    {
        return a-b;
    }

    public static double divide(double a, double b)
    {
        return a/b;
    }

    public static double multiply(double a, double b)
    {
        return a * b;
    }

    For re-submission

    public static double abs(double a)
     {
         return Math.abs(a);
     }
}
