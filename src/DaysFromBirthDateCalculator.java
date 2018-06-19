import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;

public class DaysFromBirthDateCalculator {
    public static void main(String[] args) {
        String dateBirth = "2018-06-16";
        System.out.println(daysFromBirthDate(dateBirth));
    }

    public static long daysFromBirthDate(String birthDateString) {
        LocalDate now = LocalDate.now();
        LocalDate birth = LocalDate.parse(birthDateString);
        long daysBetween = DAYS.between(birth, now);
        return daysBetween;
    }

}
