import java.util.*;
class CalendarEx3 {
    public static void main(String[] args) {
        final int[] TIME_UNIT = {3600, 60, 1};
        final String[] TIME_UNIT_NAME = {"HOUR", "MIN", "SEC"};

        Calendar time1 = Calendar.getInstance();
        Calendar time2 = Calendar.getInstance();

        //set time1 : 102030
        time1.set(Calendar.HOUR_OF_DAY, 10);
        time1.set(Calendar.MINUTE, 20);
        time1.set(Calendar.SECOND, 30);

        //set time2 : 203010
        time2.set(Calendar.HOUR_OF_DAY, 20);
        time2.set(Calendar.MINUTE, 30);
        time2.set(Calendar.SECOND, 10);

        System.out.println("time1 : "+time1.get(Calendar.HOUR_OF_DAY) +"H " 
                + time1.get(Calendar.MINUTE) +"M " + time1.get(Calendar.SECOND));
        
        System.out.println("time1 : "+time1.get(Calendar.HOUR_OF_DAY) +"H "
                + time1.get(Calendar.MINUTE) +"M " + time1.get(Calendar.SECOND));
        
        long difference = Math.abs(time2.getTimeInMillis() - time1.getTimeInMillis()) / 1000;
        System.out.println("Difference between time1 & time2 : " + difference +" sec");

        String tmp  = "";
        for(int i =0; i<TIME_UNIT.length; i++){
            tmp += difference/TIME_UNIT[i] + TIME_UNIT_NAME[i];
            difference %= TIME_UNIT[i];
        }
        System.out.println("To hhmmss : " + tmp );
    }    
}
    // time1 : 10H 20M 30
    // time1 : 10H 20M 30
    // Difference between time1 & time2 : 36580 sec
    // To hhmmss : 10HOUR9MIN40SEC