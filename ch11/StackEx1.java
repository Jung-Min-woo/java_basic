import java.util.*;
public class StackEx1 {
    public static Stack back = new Stack();
    public static Stack forward = new Stack<>();

    public static void main(String[] args) {
        goURL("1. Nate");
        goURL("2. Yahoo");
        goURL("3. Naver");
        goURL("4. Daum");

        printStatus();

        goBack();
        System.out.println("='뒤로' 버튼을 누른 후");
        printStatus();
        
        goBack();
        System.out.println("='뒤로' 버튼을 누른 후");
        printStatus();
        
        goForward();
        System.out.println("='앞으로' 버튼을 누른 후");
        printStatus();

        goURL("codechobo.com");
        System.out.println("=새로운 주소로 이동 후 ");
        printStatus();

    }
    public static void printStatus() {
        System.out.println("back:" +back);
        System.out.println("forward:"+forward);
        System.out.println("현재화면은 '" +back.peek() + "'입니다.");
        System.out.println();        
    }
    public static void goURL(String url) {
        back.push(url);
        if(!forward.empty()) forward.clear();
    }
    public static void goForward() {
        if(!forward.empty()) back.push(forward.pop());
    }
    public static void goBack() {
        if(!back.empty()) forward.push(back.pop());
    }
}
    // back:[1. Nate, 2. Yahoo, 3. Naver, 4. Daum]
    // forward:[]
    // 현재화면은 '4. Daum'입니다.

    // ='뒤로' 버튼을 누른 후
    // back:[1. Nate, 2. Yahoo, 3. Naver]
    // forward:[4. Daum]
    // 현재화면은 '3. Naver'입니다.

    // ='뒤로' 버튼을 누른 후
    // back:[1. Nate, 2. Yahoo]
    // forward:[4. Daum, 3. Naver]
    // 현재화면은 '2. Yahoo'입니다.

    // ='앞으로' 버튼을 누른 후
    // back:[1. Nate, 2. Yahoo, 3. Naver]
    // forward:[4. Daum]
    // 현재화면은 '3. Naver'입니다.

    // =새로운 주소로 이동 후 
    // back:[1. Nate, 2. Yahoo, 3. Naver, codechobo.com]
    // forward:[]
    // 현재화면은 'codechobo.com'입니다.