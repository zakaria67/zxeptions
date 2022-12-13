package be.intecbrussel;

import java.util.Scanner;

public class Oefening3 {
    public static void main(String[] args) {
        System.out.println("Fill in a number");
        Scanner scanner = new Scanner(System.in);
       try {
           String input = scanner.next();
           System.out.println(input);
           double aNumber = Double.parseDouble(input);
           System.out.println(aNumber);
           scanner.close();
           System.out.println("This is the input we tried to convert: " + input);
       }
       catch (NumberFormatException numberFormatException){
           System.out.println(numberFormatException);
       }
       finally {
           System.out.println("Finally");

       }

    }
}
