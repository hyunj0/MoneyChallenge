import java.text.DecimalFormat;
import java.util.Calendar;

/*
    My coworker thought of the idea.
    How much could I save if I put x dollars where x is the week number?
    Not only save x, but x multiplied by the month it's in.

    For instance,
    1 (week number) * 1 (month) = 1
    2 (week number) * 1 (month) = 2
    ...
    52 (week number) * 12 (month) = 624
*/

public class MoneyChallenge {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        DecimalFormat df = new DecimalFormat("$##,###");
        int totalAmountSaved = 0;

        for (int weekNumber = 1; weekNumber <= 52; weekNumber++) {
            calendar.set(Calendar.WEEK_OF_YEAR, weekNumber);
            System.out.println("Week " + weekNumber);

            int month = calendar.get(Calendar.MONTH) + 1;
            int amountToSaveThisWeek = weekNumber * month;
            System.out.println("Save " + df.format(amountToSaveThisWeek) + " this week");

            totalAmountSaved += amountToSaveThisWeek;
            System.out.println("Saved " + df.format(totalAmountSaved) + " in total");
        }

        System.out.println("You will save " + df.format(totalAmountSaved) + " in one year!");
    }
}