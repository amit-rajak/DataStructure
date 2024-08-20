package DateAndTime;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateDifferenceCalculator {

    public static void main(String[] args) {

        String startDateStr = "2024-10-31T00:00:00.000Z";
        String endDateStr = "2024-08-06T00:00:00.000Z";

        // Parse the full datetime string and extract LocalDate
        LocalDate startDate = OffsetDateTime.parse(startDateStr).toLocalDate();
        LocalDate endDate = OffsetDateTime.parse(endDateStr).toLocalDate();

        System.out.println("startDate: " + startDate + " endDate " + endDate);
        // Calculate the difference in days
        long diff = ChronoUnit.DAYS.between(startDate, endDate);

        System.out.println("Difference: " + diff + " days");
    }
}
