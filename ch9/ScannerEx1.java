import java.util.*;
class ScannerEx1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] argArr = null;

        while(true){
            String prompt = ">>";
            System.out.print(prompt);

            //화면으로부터 라인단위로 입력받는다.
            String input = s.nextLine();

            input = input.trim();
            argArr = input.split(" +"); // 입력받은 내용을 공백을 구분자로 자름

            String command = argArr[0].trim();

            if("".equals(command)) continue;

            command = command.toLowerCase();

            if(command.equals("q")){
                System.exit(0);
            } else{
                for(int i =0; i < argArr.length ; i++) System.out.println(argArr[i]);
            }
        }
    }
}