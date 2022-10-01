import java.text.MessageFormat;
import java.util.*;
class MessageFormatEx1 {
    public static void main(String[] args) {
        String msg = "Name : {0} \nTel : {1}\nAge : {2} \nBirthday : {3}";
        Object[] argumetns = { "이자바", "02-123-1234", "27", "07-09"};
        String result = MessageFormat.format(msg, argumetns);
        System.out.println(result);
    }
}
// Name : 이자바 
// Tel : 02-123-1234
// Age : 27 
// Birthday : 07-09