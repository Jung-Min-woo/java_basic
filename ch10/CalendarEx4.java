import java.util.*;

class CalendarEx4 {
    public static void main(String[] args) {
        Calendar date = Calendar.getInstance();
        date.set(2005, 7, 31); //2005 08 31

        System.out.println(toString(date));

        System.out.println("= 1 Day After =");
        date.add(Calendar.DATE, 1);
        System.out.println(toString(date));

        System.out.println("= 6 Months Before =");
        date.add(Calendar.MONTH, -6);
        System.out.println(toString(date));
        
        System.out.println("= 31 Days After =");
        date.add(Calendar.DATE, 31);
        System.out.println(toString(date));
    
        //'Roll' does not change MONTH FIELD
        System.out.println("= 31 Days After(ROLL) =");
        date.roll(Calendar.DATE, 31);
        System.out.println(toString(date));
    }
    public static String toString(Calendar date){
        return date.get(Calendar.YEAR) +"Y " + (date.get(Calendar.MONTH) + 1)+"M " + date.get(Calendar.DATE)+"D";
    }
}
    // 2005Y 8M 31D
    // = 1 Day After =
    // 2005Y 9M 1D
    // = 6 Months Before =
    // 2005Y 3M 1D
    // = 31 Days After =
    // 2005Y 4M 1D
    // = 31 Days After(ROLL) =
    // 2005Y 4M 2D