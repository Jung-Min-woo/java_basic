import java.util.*;
class Exercise8_8re {
    public static void main(String[] args) {
        int counter = 0;
        int input = 0;
        int answer = (int)(100*Math.random() + 1);
        do{
            System.out.print("Print a number between 1 and 100>");
            
            try{
                input = new Scanner(System.in).nextInt();
            }catch(Exception e){
                System.out.println("Invalid input");
                e.printStackTrace();
                continue;
            }
            counter++;
            if(input == answer) break;
            else if(input>answer) System.out.println("Down!");
            else System.out.println("UP!");
        }while(true);
        
        System.out.println("You got the answer");
        System.out.println("You've tried " + counter + " times");
    }
}