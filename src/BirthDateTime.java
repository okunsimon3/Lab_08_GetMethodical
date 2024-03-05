import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int birthYear = 0;
        int birthMonth = 0;
        int birthDay = 0;
        int numDays = 0;
        int birthHour = 0;
        int birthMinute = 0;

        birthYear = SafeInput.getRangedInt(in, "Enter the year you were born ", 1950, 2015);
        birthMonth = SafeInput.getRangedInt(in, "Enter the month you were born", 1, 12);
        switch(birthMonth) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
                numDays = 31;
                break;
            case 4:
            case 6:
            case 8:
            case 10:
            case 12:
                numDays = 30;
                break;
            case 2:
                numDays = 29;
                break;
        }
        birthDay = SafeInput.getRangedInt(in, "Enter the day you were born", 1, numDays);
        birthHour = SafeInput.getRangedInt(in, "Enter the hour you were born", 1, 24);
        birthMinute = SafeInput.getRangedInt(in, "Enter the minute you were born", 1, 59);

        System.out.println("You were born at " + birthHour + ":" + birthMinute + " on " + birthMonth + "/" + birthDay + "/" + birthYear);


    }
}
