import java.util.*;
import java.text.*;

class DateFormatEx4 {
    public static void main(String[] args) {
        String pattern = "yyyy/MM/dd";
        DateFormat df = new SimpleDateFormat(pattern);
        
        Scanner sc = new Scanner(System.in);
        Date inDate = null;
        System.out.println("날짜를 " + pattern + "의 형태로 입력");
        while(sc.hasNextLine()){
            try{
                inDate = df.parse(sc.nextLine());
                break;
            } catch(Exception e){
                System.out.println("날짜를 " + pattern + "의 형태로 다시 입력해 주세요.");
            }
        }
        Calendar cal = Calendar.getInstance();
        cal.setTime(inDate);
        Calendar today = Calendar.getInstance();
        long day = (cal.getTimeInMillis() - today.getTimeInMillis())/(60*60*1000);
        System.out.println("Input Date - Now = " + day + " Hours");
    }
}