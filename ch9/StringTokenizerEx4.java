import java.time.temporal.Temporal;
import java.util.*;

class StringTokenizerEx4 {
    public static void main(String[] args) {
        String input = "삼십만삼천백십오";
        
        System.out.println(input);
        System.out.println(hangulToNum(input));
    }
    public static long hangulToNum(String input){
        long result = (long)0;
        long temp = (long)0;
        long num = (long)0;

        final String NUMBER = "영일이삼사오육칠팔구";
        final String UNIT = "십백천만억조";
        final long[] UNIT_NUM = {10, 100, 1000, 10000, (long)1e8, (long)1e12};

        StringTokenizer st = new StringTokenizer(input, UNIT, true);
        
        while(st.hasMoreTokens()){
            String token = st.nextToken();
            int check = NUMBER.indexOf(token);

            //check == -1 : unit
            if(check == -1){
                if("만억조".indexOf(token) == -1){
                    temp += (num == 0 ? 1 : num) * UNIT_NUM[UNIT.indexOf(token)];
                } else {
                    temp += num;
                    result += (temp == 0 ? 1 : temp) * UNIT_NUM[UNIT.indexOf(token)];
                    temp = 0;
                }
                num = 0;
            } else{
                num = check;
            }
        }
        return result + temp + num ;
    }
}
    // 삼십만삼천백십오
    // 303115