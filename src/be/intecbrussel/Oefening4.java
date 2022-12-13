package be.intecbrussel;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Oefening4 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        for (;;){
            System.out.print("Enter the number: ");
            int input = scanner.nextInt();
            if(!scanner.hasNextInt()) {
                //
                throw new InputMismatchException("not integer");
            }
            else {
                System.out.println("The number is an integer");
                break;
            }
        }
    }
}
