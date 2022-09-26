import java.util.*;
class CalenderEx1 {
    public static void main(String[] args) {
        Calendar today = Calendar.getInstance();
        System.out.println("This year : " + today.get(Calendar.YEAR));
        System.out.println("Month(0~11, 0 : January) : " + today.get(Calendar.MONTH));
        System.out.println("This year's Nth week : " + today.get(Calendar.WEEK_OF_YEAR));
        System.out.println("This Month's Nth week : " + today.get(Calendar.WEEK_OF_MONTH));
        
        // DATE == DAY_OF_MONTH
        System.out.println("This Month's Nth day : " +today.get(Calendar.DAY_OF_MONTH));
        System.out.println("This Month's Nth day : " +today.get(Calendar.DATE));
        System.out.println("This Year's Nth day : " +today.get(Calendar.DAY_OF_YEAR));
        System.out.println("This month's Nth Day of week 1~7, 1(Monday) : " +today.get(Calendar.DAY_OF_WEEK));
        System.out.println("This month's Nth Day of week : " + today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println("AM_PM(0:AM, 1:PM) : "+ today.get(Calendar.AM_PM));

        System.out.println("HOUR(0~11) : " + today.get(Calendar.HOUR));
        System.out.println("Hour(0~23) : " + today.get(Calendar.HOUR_OF_DAY));
        System.out.println("Minute(0~59) : " + today.get(Calendar.MINUTE));
        System.out.println("Second(0~59) : " + today.get(Calendar.SECOND));

        System.out.println("MilliSec(0~999) : " + today.get(Calendar.MILLISECOND));
        System.out.println("TimeZone(-12~+12) : " + (today.get(Calendar.ZONE_OFFSET)/(60*60*1000)));
        System.out.println("Last date of this month : " + today.getActualMaximum(Calendar.DATE));
    }
}
    // This year : 2022
    // Month(0~11, 0 : January) : 8
    // This year's Nth week : 40
    // This Month's Nth week : 5
    // This Month's Nth day : 26
    // This Month's Nth day : 26
    // This Year's Nth day : 269
    // This month's Nth Day of week 1~7, 1(Monday) : 2
    // This month's Nth Day of week : 4
    // AM_PM(0:AM, 1:PM) : 1
    // HOUR(0~11) : 1
    // Hour(0~23) : 13
    // Minute(0~59) : 45
    // Second(0~59) : 41
    // MilliSec(0~999) : 63
    // TimeZone(-12~+12) : 9
    // Last date of this month : 30