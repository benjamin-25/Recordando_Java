package ScannerExample;

import java.util.Scanner;

public class NumberCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = SimpleCalculator.getNumber(scanner, "Ingresa un numero: ");
        int number2 = SimpleCalculator.getNumber(scanner, "Ingresa otro numero: ");

        SimpleCalculator.printArithmeticOperation(number1, number2);

        SimpleCalculator.compareNumbers(number1, number2);
    }
}
