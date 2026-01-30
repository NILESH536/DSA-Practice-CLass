import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;
        int result;
        String ops;

        System.out.println("Enter number1:");
        num1 = sc.nextInt();

        System.out.println("Enter number2:");
        num2 = sc.nextInt();

        System.out.println("Enter operation:");
        ops = sc.next();   // add, sub, mult, div, shitr, shiftl

        if (ops.equals("add")) {
            result = num1 + num2;
            System.out.println(result);

        } else if (ops.equals("mult")) {
            result = num1 * num2;
            System.out.println(result);

        } else if (ops.equals("sub")) {
            result = num1 - num2;
            System.out.println(result);

        } else if (ops.equals("div")) {
            if (num2 == 0) {
                System.out.println("Division by zero not allowed");
            } else {
                result = num1 / num2;
                System.out.println(result);
            }

        } else if (ops.equals("shitr")) {
            result = num1 >> num2;
            System.out.println(result);

        } else if (ops.equals("shiftl")) {
            result = num1 << num2;
            System.out.println(result);

        } else {
            System.out.println("Invalid operation");
        }

        sc.close();
    }
}
