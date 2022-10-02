import java.time.*;

class NewTimeEx2 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2015, 12, 31);
        LocalTime time = LocalTime.of(12, 34, 56);

        LocalDateTime dt = LocalDateTime.of(date, time);
        ZoneId zid = ZoneId.of("Asia/Seoul");
        ZonedDateTime zdt = dt.atZone(zid);
        //String strZid = zdt.getZone().getID();
        
        ZonedDateTime seoulTime = ZonedDateTime.now();
        ZoneId nyID = ZoneId.of("America/New_York");
        ZonedDateTime nyTime = ZonedDateTime.now().withZoneSameInstant(nyID);

        // ZonedDateTime -> OffsetDateTime
        OffsetDateTime odt = zdt.toOffsetDateTime();

        System.out.println(dt);                 // 2015-12-31T12:34:56  
        System.out.println(zid);                // Asia/Seoul
        System.out.println(zdt);                // 2015-12-31T12:34:56+09:00[Asia/Seoul]
        System.out.println(seoulTime);          // 2022-10-02T06:04:18.997+09:00[Asia/Seoul]
        System.out.println(nyTime);             // 2022-10-01T17:04:18.998-04:00[America/New_York]
        System.out.println(odt);                 // 2015-12-31T12:34:56+09:00
    }
}
// 2015-12-31T12:34:56
// Asia/Seoul
// 2015-12-31T12:34:56+09:00[Asia/Seoul]
// 2022-10-02T06:04:18.997+09:00[Asia/Seoul]
// 2022-10-01T17:04:18.998-04:00[America/New_York]
// 2015-12-31T12:34:56+09:00