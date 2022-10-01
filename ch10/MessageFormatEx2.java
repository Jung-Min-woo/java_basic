import java.text.*;

class MessageFormatEx2 {
    public static void main(String[] args) {
        String tableName = "CUST_INFO";
        String msg = "INSERT_INFO" + tableName + " Values (''{0}'', ''{1}'', {2}, ''{3}'');";   //'' -> print ' 
        System.out.println(msg);

        Object[][] arguments = {
            {"이자바", "02-123-1234", "27", "07-09"},
            {"김자바", "032-333-1234", "33", "10-07"}
        };
        for(int i =0 ; i<arguments.length; i++){
            String result = MessageFormat.format(msg, arguments[i]);
            System.out.println(result);
        }
    }
}
// INSERT_INFOCUST_INFO Values (''{0}'', ''{1}'', {2}, ''{3}'');
// INSERT_INFOCUST_INFO Values ('이자바', '02-123-1234', 27, '07-09');
// INSERT_INFOCUST_INFO Values ('김자바', '032-333-1234', 33, '10-07');