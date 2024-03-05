import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String SSN = "";
        String mNumber = "";
        String menuChoice = "";

        SSN = SafeInput.getRegExString(in, "Enter your SSN", "\\d{3}-\\d{2}-\\d{4}");
        mNumber = SafeInput.getRegExString(in, "Enter your UC M Number", "^(M|m)\\d{5}$");
        menuChoice = SafeInput.getRegExString(in, "Enter your choice on the menu", "^[OoSsVvQq]$");
        System.out.println("Your SSN is " + SSN);
        System.out.println("Your UC M number is " + mNumber);
        System.out.println("Your choice on the menu is " + menuChoice);
    }
}
