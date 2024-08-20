package DateAndTime;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TransactionCalculator {

    public int getNumberOfTransactions(String start, String end, int interval, String recurrenceInterval) {
        LocalDate startDate = LocalDate.parse(start);
        LocalDate endDate = LocalDate.parse(end);
        int diff = 0;

        if (recurrenceInterval.equals("MONTHLY") ||
                recurrenceInterval.equals("TWOMONTHS") ||
                recurrenceInterval.equals("THREEMONTHS") ||
                recurrenceInterval.equals("SIXMONTHS")) {

            diff = monthDiff(startDate, endDate) / interval;

        } else if (recurrenceInterval.equals("WEEKLY") ||
                recurrenceInterval.equals("TWOWEEKS")) {

            diff = inBetween(startDate, endDate, ChronoUnit.WEEKS) / interval;

        } else if (recurrenceInterval.equals("YEARLY")) {
            diff = endDate.getYear() - startDate.getYear();

            if (endDate.getMonthValue() < startDate.getMonthValue() ||
                    (endDate.getMonthValue() == startDate.getMonthValue() && endDate.getDayOfMonth() < startDate.getDayOfMonth())) {
                diff -= 1;
            }
        }

        return diff + 1;
    }

    private int monthDiff(LocalDate startDate, LocalDate endDate) {
        return (int) ChronoUnit.MONTHS.between(startDate, endDate);
    }

    private int inBetween(LocalDate startDate, LocalDate endDate, ChronoUnit unit) {
        return (int) unit.between(startDate, endDate);
    }

    public static void main(String[] args) {
        TransactionCalculator calculator = new TransactionCalculator();
        String start = "2023-01-01";
        String end = "2024-01-01";
        int interval = 1;
        String recurrenceInterval = "MONTHLY";

        int numberOfTransactions = calculator.getNumberOfTransactions(start, end, interval, recurrenceInterval);
        System.out.println("Number of transactions: " + numberOfTransactions);
    }
}

