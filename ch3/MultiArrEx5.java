import java.util.*;
class MultiArrEx5 {
    public static void main(String[] args){
        String[][] words = {
            {"chair", "의자"},
            {"computer", "컴퓨터"},
            {"integer", "정수"}
        };

        Scanner scanner = new Scanner(System.in);
        for(int i =0; i<words.length; i++){
            System.out.printf("Q%d. What is meaning of \"%s\" in Korean? :", i+1, words[i][0]);
            String temp = scanner.nextLine();
            if(temp.equals(words[i][1])) System.out.println("Right!");
            else System.out.println("Wrong!");
        }
    }    
}
