/*
    My coworker thought of the idea.
    How much could I save if I put x dollars in the bank where x is the week number?
    Also, not just x, but x multiplied by the month it's in.

    For instance,
    1 (week number) * 1 (month) = 1
    2 (week number) * 1 (month) = 2
    ...
*/

import java.util.Calendar;

public class MoneyChallenge {

    public static void main(String[] args) {
        int month;
        int moneySaved = 0;
        int amountToSave = 0;

        Calendar calendar = Calendar.getInstance();

        for (int weekNumber = 1; weekNumber <= 52; weekNumber++) {
            System.out.println("Week " + weekNumber);
            calendar.set(Calendar.WEEK_OF_YEAR, weekNumber);
            month = calendar.get(Calendar.MONTH)+1;
            System.out.println("Beginning Balance " + moneySaved);
            amountToSave = weekNumber * month;
            System.out.println("Amount to Save " + amountToSave);
            moneySaved = moneySaved + weekNumber * month;
            System.out.println("Ending Balace " + moneySaved);
        }
    }

}