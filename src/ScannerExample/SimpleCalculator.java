package ScannerExample;

import java.util.Scanner;

public class SimpleCalculator {

    public static int getNumber(Scanner sc,String message){
        System.out.println(message);
        return sc.nextInt();
    }

    public static void printArithmeticOperation(int number1, int number2){
        System.out.println("la suma de ambos numeros es: " + (number1 + number2));
        System.out.println("la diferencia de ambos numeros es: " + (number1 - number2));
    }

    public static void compareNumbers(int number1, int number2){
        if(number1 > number2){
            System.out.println("el numero" + number1 + " es mayor que " + number2);
        } else {
            System.out.println("el numero " + number1 + " es menor que " + number2);
        }
    }
}
