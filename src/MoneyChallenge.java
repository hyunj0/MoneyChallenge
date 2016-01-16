/*
    My coworker thought of the idea.
    How much could I save if I put x dollars in the bank where x is the week number?
    Also, not just x, but x multiplied by the month it's in.

    For instance,
    1 (week number) * 1 (month) = 1
    2 (week number) * 1 (month) = 2
    ...
    52 (week number) * 12 (month) = 624
*/

import java.text.DecimalFormat;
import java.util.Calendar;

public class MoneyChallenge {

    public static void main(String[] args) {

        int weekNumber;
        int month;
        int amountToSaveThisWeek;
        int totalAmountSaved = 0;

        Calendar calendar = Calendar.getInstance();
        DecimalFormat df = new DecimalFormat("$###,###");

        for (weekNumber = 1; weekNumber <= 52; weekNumber++) {
            System.out.println("Week " + weekNumber);
            calendar.set(Calendar.WEEK_OF_YEAR, weekNumber);
            month = calendar.get(Calendar.MONTH) + 1;

            amountToSaveThisWeek = weekNumber * month;
            System.out.println("Save " + df.format(amountToSaveThisWeek) + " this week");

            totalAmountSaved = totalAmountSaved + amountToSaveThisWeek;
            System.out.println("Saved " + df.format(totalAmountSaved) + " thus far");
        }
    }

}