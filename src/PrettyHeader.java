import java.util.Scanner;

public class PrettyHeader {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String message = "";


        System.out.print("Enter your message: ");
        message = in.nextLine();
        SafeInput.prettyHeader(message);
    }
}
