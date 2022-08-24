import java.util.Scanner;

public class MinMaxMethods {
    public static void main(String[] args) {
        boolean isMinimum = true;

        double num1 = userInput("first");
        double num2 = userInput("second");
        double num3 = userInput("third");

        intOrFloat(num1, num2, num3, isMinimum);

    }

    // Requests user to input a number
    public static double userInput(String input) {
        Scanner reader = new Scanner(System.in);
        boolean isNumber = false;
        double num = 0;

        while(!isNumber) {
            System.out.print(("Please enter your " + input + " number: "));

            try {
                num = Double.parseDouble(reader.nextLine());
                isNumber = true;
            } catch (NumberFormatException ignored) {

            }
        }

        return num;
    }

    // Calculates whether the user input is an int or double, and converts the data type accordingly. Calls on min/max methods and printAnswer
    public static void intOrFloat(double num1, double num2, double num3, boolean isMinimum) {
        if(num1 % 1 == 0 && num2 % 1 == 0 && num3 % 1 == 0) {
            int intNum1 = (int) num1;
            int intNum2 = (int) num2;
            int intNum3 = (int) num3;

            int intMinValue = minimumNum(intNum1, intNum2, intNum3, isMinimum);
            int intMaxValue = maximumNum(intNum1, intNum2, intNum3, isMinimum);

            printAnswer(intMinValue, isMinimum);
            printAnswer(intMaxValue, isMinimum);
        } else {
            double doubleMinValue = minimumNum(num1, num2, num3, isMinimum);
            double doubleMaxValue = maximumNum(num1, num2, num3, isMinimum);

            printAnswer(doubleMinValue, isMinimum);
            printAnswer(doubleMaxValue, isMinimum);
        }
    }

    // Finds out the minimum value amongst the 3 values (int version)
    public static int minimumNum(int num1, int num2, int num3, boolean isMinimum) {
         isMinimum = true;
        if(num1 < num2 && num1 < num3) {
            return num1;
        } else return Math.min(num2, num3);
    }

    // Finds out the maximum value amongst the 3 values (int version)
    public static int maximumNum(int num1, int num2, int num3, boolean isMinimum) {
        isMinimum = false;

        if(num1 > num2 && num1 > num3) {
            return num1;
        } else return Math.max(num2, num3);
    }

    // Finds out the minimum value amongst the 3 values (double version)
    public static double minimumNum(double num1, double num2, double num3, boolean isMinimum) {
        isMinimum = true;
        if(num1 < num2 && num1 < num3) {
            return num1;
        } else return Math.min(num2, num3);
    }

    // Finds out the maximum value amongst the 3 values (double version)
    public static double maximumNum(double num1, double num2, double num3, boolean isMinimum) {
        isMinimum = false;

        if(num1 > num2 && num1 > num3) {
            return num1;
        } else return Math.max(num2, num3);
    }

    // Print the answer from min/math methods (int version)
    public static void printAnswer(int value, boolean isMinimum) {
        if(isMinimum) {
            System.out.println("The minimum value is " + value);
        } else {
            System.out.println("The maximum value is " + value);
        }
    }

    // Print the answer from min/math methods (double version)
    public static void printAnswer(double value, boolean isMinimum) {
        if(isMinimum) {
            System.out.println("The minimum value is " + value);
        } else {
            System.out.println("The maximum value is " + value);
        }
    }
}
