import java.util.Scanner;
public class Calculator {
    static void prompt(String mode) {
        double result = 0;
        Scanner getNum = new Scanner(System.in);
        System.out.println("First number: ");
        double first = getNum.nextDouble();
        System.out.println("Second number: ");
        double second = getNum.nextDouble();
        getNum.close();
        switch (mode) {
            case "1": result = first + second; break;
            case "2": result = first - second; break;
            case "3": result = first * second; break;
            case "4": result = first / second; break;
        }
        System.out.println("Result: " + result);
    }
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Mode: \n1. Addition\n2. Substraction\n3. Multiplication\n4. Division");
        String mode = myObj.nextLine();
        prompt(mode);
        myObj.close();
    }
}