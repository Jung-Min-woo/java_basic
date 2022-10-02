import java.time.*;
import java.time.temporal.*;
import static java.time.DayOfWeek.*;
import static java.time.temporal.TemporalAdjusters.*;

class DayAfterTomorrow implements TemporalAdjuster{
    @Override
    public Temporal adjustInto(Temporal temporal) {
        return temporal.plus(2, ChronoUnit.DAYS);
    }
}
class NewTimeEx3 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate date = today.with(new DayAfterTomorrow());
        p(today);
        p(date);
        p(today.with(firstDayOfNextMonth()));
        p(today.with(firstDayOfMonth()));
        p(today.with(lastDayOfMonth()));
        p(today.with(firstInMonth(TUESDAY)));
        p(today.with(lastInMonth(TUESDAY)));
        p(today.with(previous(TUESDAY)));  //지난 주 화요일
        p(today.with(previousOrSame(TUESDAY))); // 지난 주 화요일(오늘 포함)
        p(today.with(next(TUESDAY)));
        p(today.with(nextOrSame(TUESDAY)));
        p(today.with(dayOfWeekInMonth(4, TUESDAY))); // 이번 달 4번째 화요일
    }
    static void p(Object obj){
        System.out.println(obj);
    }
}
// 2022-10-02
// 2022-10-04
// 2022-11-01
// 2022-10-01
// 2022-10-31
// 2022-10-04
// 2022-10-25
// 2022-09-27
// 2022-09-27
// 2022-10-04
// 2022-10-04
// 2022-10-25