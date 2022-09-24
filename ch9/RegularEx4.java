import java.util.regex.*;
class RegularEx4 {
    public static void main(String[] args) {
        String source = "A broken hand works, but not a broken heart.";
        String pattern = "broken";
        StringBuffer sb = new StringBuffer();
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(source);
        System.out.println("soutce:" +source);
        
        int i = 0;
        while(m.find()){
            System.out.println(++i + "'s matching : " +m.start() + "~" + m.end());
            m.appendReplacement(sb, "drunken");
        }
        m.appendTail(sb);
        System.out.println("Replacement count : " + i );
        System.out.println("result : " + sb.toString());
    }
}
// soutce:A broken hand works, but not a broken heart.
// 1's matching : 2~8
// 2's matching : 31~37
// Replacement count : 2
// result : A drunken hand works, but not a drunken heart.