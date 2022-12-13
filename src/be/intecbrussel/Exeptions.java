package be.intecbrussel;

public class Exeptions {
    public static void main(String[] args) {
        try {
            int num = 5;
            int result = num / 0;
            System.out.println(result);
        } catch (ArithmeticException arithmeticException) {
            //System.out.println(arithmeticException);
            arithmeticException.printStackTrace();

        }
    }
}

