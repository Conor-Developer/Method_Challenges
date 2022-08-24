import java.util.Scanner;

public class MyCalculator {
    public static void main(String[] args) {
        double num1 = userInput("first");
        double num2 = userInput("second");
        add(num1, num2);
        subtract(num1, num2);
        multiply(num1, num2);
        divide(num1, num2);
    }

    // Asks for user input and only accepts a numeral value
    public static double userInput(String input) {
        Scanner reader = new Scanner(System.in);
        boolean isNumber = false;
        double num = 0;

        while(!isNumber) {
            System.out.print(("Please enter your " + input + " number: "));

            try {
                num = Double.parseDouble(reader.nextLine());
                isNumber = true;
            }
            catch(NumberFormatException e) {
                isNumber = false;
            }
        }

        return num;
    }

    public static void add(double num1, double num2) {
        System.out.println(num1 + " + " + num2 + " is " + (num1 + num2));
    }

    public static void subtract(double num1, double num2) {
        System.out.println(num1 + " - " + num2 + " is " + (num1 - num2));
    }

    public static void multiply(double num1, double num2) {
        System.out.println(num1 + " * " + num2 + " is " + (num1 * num2));
    }

    public static void divide(double num1, double num2) {
        System.out.println(num1 + " / " + num2 + " is " + (num1 / num2));
    }
}
