/* ------------ Description -------------
 *
 * c[a-z]*      :   c로 시작하는 영단어
 * c[a-z]       :   c로 시작하는 두 자리 영단어
 * c[a-zA-Z]    :   c로 시작하는 두 자리 영단어(a~z, A~Z)
 * c[a-zA-Z0-9] :   c로 시작하고 숫자/영어로 조합된 두글자
 * c\w          :   c로 시작하고 숫자/영어로 조합된 두글자
 * c\d          :   c와 숫자로 구성된 두 문자
 * c[0-9]       :   c와 숫자로 구성된 두 문자
 * .*           :   모든 문자열
 * c.           :   c로 시작하는 두 자리
 * c\.          :   c. 과 일치하는 문자열
 * c.*t         :   c로 시작하고 t로 끝나는 모든 문자열
 * [b|c].*      :   b 또는 c로 시작하는 문자열
 * [bc].*       :   b 또는 c로 시작하는 문자열
 * [b-c].*      :   b 또는 c로 시작하는 문자열
 * [^b|c].*     :   b 또는 c로 시작하지 않는 문자열
 * [^bc].*      :   b 또는 c로 시작하지 않는 문자열
 * [^b-c].*     :   b 또는 c로 시작하지 않는 문자열
 * .*a.*        :   a를 포함하는 모든 문자열
 * .*a.+        :   a를 포함하는 모든 문자열 // + : 1 또는 그 이상의 문자   
 * [b|c].{2}    :   b 또는 c로 시작하는 세자리 문자열
 * ----------------------------------------
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegularEx2 {
    public static void main(String[] args) {
        String[] data = {"bat", "baby", "bonus", "c", "cA",
                        "ca", "co", "c.", "c0", "c#",
                        "car", "combat", "count", "date", "disc"};
        String[] pattern = {".*", "c[a-z]*", "c[a-z]", "c[a-zA-Z]",
                            "c[a-zA-Z0-9]", "c.", "c.*", "c\\.", "c\\w",
                            "c\\d", "c.*t", "[b|c].*", "a.*", ".*a.+", "[b|c].{2}"};
        for(int x=0; x<pattern.length; x++){
            Pattern p = Pattern.compile(pattern[x]);
            System.out.print("Pattern : "+ pattern[x] + " result : ");
            for(int i=0; i<data.length; i++){
                Matcher m = p.matcher(data[i]);
                if(m.matches()) System.out.print(data[i] +", ");
            }
            System.out.println();
        }
    }
}
    // Pattern : .* result : bat, baby, bonus, c, cA, ca, co, c., c0, c#, car, combat, count, date, disc, 
    // Pattern : c[a-z]* result : c, ca, co, car, combat, count, 
    // Pattern : c[a-z] result : ca, co, 
    // Pattern : c[a-zA-Z] result : cA, ca, co, 
    // Pattern : c[a-zA-Z0-9] result : cA, ca, co, c0, 
    // Pattern : c. result : cA, ca, co, c., c0, c#, 
    // Pattern : c.* result : c, cA, ca, co, c., c0, c#, car, combat, count, 
    // Pattern : c\. result : c., 
    // Pattern : c\w result : cA, ca, co, c0, 
    // Pattern : c\d result : c0, 
    // Pattern : c.*t result : combat, count, 
    // Pattern : [b|c].* result : bat, baby, bonus, c, cA, ca, co, c., c0, c#, car, combat, count, 
    // Pattern : a.* result : 
    // Pattern : .*a.+ result : bat, baby, car, combat, date, 
    // Pattern : [b|c].{2} result : bat, car, 