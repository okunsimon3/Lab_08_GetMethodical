import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int favNumber = 0;

        double favDec = 0.0;
        favNumber = SafeInput.getInt(in, "Enter your favorite number");
        favDec = SafeInput.getDouble(in, "Enter your favorite decimal number");
        System.out.println("Your favorite number is: " + favNumber);
        System.out.println("Your favorite decimal number is: " + favDec);
    }
}
