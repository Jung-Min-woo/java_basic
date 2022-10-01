import java.util.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.*;

class NewTimeEx1 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalTime now = LocalTime.now();

        LocalDate birthDate = LocalDate.of(1999, 12, 31);
        LocalTime birthTime = LocalTime.of(23, 59, 59);

        System.out.println("today="+today);
        System.out.println("now="+now);
        System.out.println("birthDate="+birthDate);
        System.out.println("birthTime="+birthTime);

        System.out.println(birthDate.withYear(2000));
        System.out.println(birthDate.plusDays(1));
        System.out.println(birthDate.plus(1, ChronoUnit.DAYS));

        //23:59:59 -> 23:00
        System.out.println(birthTime.truncatedTo(ChronoUnit.HOURS));

        //Find Range of ChronoUnit
        System.out.println(ChronoField.CLOCK_HOUR_OF_DAY.range());  // 1 ~ 24
        System.out.println(ChronoField.HOUR_OF_DAY.range());          // 0 ~ 23
    }    
}
// today=2022-10-02
// now=05:33:01.306
// birthDate=1999-12-31
// birthTime=23:59:59
// 2000-12-31
// 2000-01-01
// 2000-01-01
// 23:00
// 1 - 24
// 0 - 23