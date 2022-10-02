import java.sql.Date;
import java.time.*;
import java.time.format.*;

class DateFormatterEx1 {
    public static void main(String[] args) {
        ZonedDateTime zdateTime = ZonedDateTime.now();
        String[] patternArr = {
            "yyyy-MM-dd HH:mm:ss",
            "''yy년 MMM dd일 E요일",
            "yyyy-MM-dd HH:mm:ss.SSS Z VV",
            "yyyy-MM-dd hh:mm:ss a",
            "오늘은 올 해의 D번째 날이다.",
            "오늘은 이번 달의 d번째 날이다.",
            "오늘은 올 해의 w번째 주이다.",
            "오늘은 이번 달의 W번째 주이다.",
            "오늘은 이번 달의 W번째 E요일이다."
        };

        for(String p : patternArr){
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(p);
            System.out.println(zdateTime.format(formatter));
        }
    }
}
// 2022-10-02 17:16:16
// '22년 Oct 02일 Sun요일
// 2022-10-02 17:16:16.852 +0900 Asia/Seoul
// 2022-10-02 05:16:16 PM
// 오늘은 올 해의 275번째 날이다.
// 오늘은 이번 달의 2번째 날이다.
// 오늘은 올 해의 41번째 주이다.
// 오늘은 이번 달의 2번째 주이다.
// 오늘은 이번 달의 2번째 Sun요일이다.