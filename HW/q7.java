import java.util.*;
class q7 {
    public static void main(String[] args) {
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Input(Exit Code = Crtl+C) >> ");
            String inp = new String(sc.nextLine());
            printLongestPalindromeSubstring(inp);
        } while (true);
    }
    public static void printLongestPalindromeSubstring(String str) {
        /*
         * same letter ~ same letter
         * str.length -- == -1 search 
         */
        String target = new String();
        for(int i = str.length() ; i>0 ; i--){
            for(int j = 0 ; j < str.length() - i  ;j++){
                target = str.substring( j, j+i+1 );
                if( target.equals(makeStringAdverse(target)) ){
                    System.out.println(target);
                    return;
                }
            }
        }
        System.out.println(str.charAt(0));
    }   
    public static String makeStringAdverse(String str) {
        StringBuffer sb = new StringBuffer(str);
        return sb.reverse().toString();
    } 
}