/**
 * CalendarEx2
 */
import java.util.*;
public class CalendarEx2 {
    public static void main(String[] args) {
        final String[] DAY_OF_WEEK = {"", "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        Calendar date1 = Calendar.getInstance();
        Calendar date2 = Calendar.getInstance();
        
        date1.set(2022,7,15); //2015 08 15
        System.out.println("date1 : " + toString(date1) +DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)]);
        System.out.println("date2 : " + toString(date2) +DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)]);

        //difference
        long difference = (date2.getTimeInMillis() - date1.getTimeInMillis()) / 1000;
        System.out.println("date1 ~ date2 : " + difference + " seconds left");
        System.out.println("date1 ~ date2 : " + difference/(24*60*60) + " days left");
    }
    public static String toString(Calendar date) {
        // TODO Auto-generated method stub
        return date.get(Calendar.YEAR) + "y " + (date.get(Calendar.MONTH)+1) + "m " + date.get(Calendar.DATE) + "d";
    }
}
// date1 : 2022y 8m 15dMON
// date2 : 2022y 9m 27dTUE
// date1 ~ date2 : 3715200 seconds left
// date1 ~ date2 : 43 days left