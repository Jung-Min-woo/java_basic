import java.util.*;
class CalendarEx5 {
    public static void main(String[] args) {
        Calendar date = Calendar.getInstance();

        date.set(2015, 0, 31); //2015 01 31
        System.out.println(toString(date));

        //'Roll' makes last date of Month
        date.roll(Calendar.MONTH, 1);
        System.out.println(toString(date));
    }
    public static String toString(Calendar date){
        return date.get(Calendar.YEAR) + "Y " + (date.get(Calendar.MONTH)+1) + "M " + date.get(Calendar.DATE)+ "D";
    }
}
// 2015Y 1M 31D
// 2015Y 2M 28D