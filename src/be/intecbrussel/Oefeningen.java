package be.intecbrussel;

import java.sql.Array;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Oefeningen {
    public static void main(String[] args) {
        try {
            int num = 5;
            int result = num / 0;
            System.out.println(result);
        } catch (ArithmeticException arithmeticException) {
            System.out.println(arithmeticException);
            //arithmeticException.printStackTrace();
        }
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter Integer Value: ");
            Integer inputInt = scanner.nextInt(); // input : "1.1"
            System.out.println(inputInt);

        } catch (InputMismatchException ex) {
            System.out.println("We have given input as float expecting integer " + ex);
        }

        try {
            int[] array = new int[5];
            System.out.println(array[5]);
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.out.println(arrayIndexOutOfBoundsException);
        }
        try {
        } catch (ArithmeticException a) {

        } catch (Exception e) {

        }



    }
}


