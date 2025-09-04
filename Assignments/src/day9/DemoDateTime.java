package day9;

import java.time.*;
import java.util.stream.Stream;

public class DemoDateTime {
    public static void main(String[] args) {

        LocalDate birthDate = LocalDate.of(2002, 3, 15);
        LocalDate today = LocalDate.now();

        Period age = birthDate.until(today);
        System.out.format("Age: %d years %d months %d days\n", age.getYears(), age.getMonths(), age.getDays());

        Stream<LocalDate> dates = LocalDate.of(2025, 1, 1).datesUntil(LocalDate.of(2026, 1, 1));
        dates.filter(d -> d.getDayOfYear() == 256).forEach(System.out::println);

        LocalTime departureTime = LocalTime.of(2, 5);
        LocalTime arrivalTime = LocalTime.of(8, 40);
        Duration timeTaken = Duration.between(departureTime, arrivalTime);
        System.out.format("Time Taken by Flight: %d hours %d minutes", timeTaken.toHoursPart(), timeTaken.toMinutesPart());
    }
}
