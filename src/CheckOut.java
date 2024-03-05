import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double itemPrice = 0;
        double totalPrice = 0;
        boolean done = false;

        do {
            itemPrice = SafeInput.getRangedDouble(in, "Enter the price of your item", .50, 10.00);
            totalPrice = itemPrice + totalPrice;
            done = SafeInput.getYNConfirm(in, "Are you done [Y or N]");

        }while(!done);
        System.out.printf("The total cost of your items is $" + "%.2f\n", totalPrice);

    }
}
