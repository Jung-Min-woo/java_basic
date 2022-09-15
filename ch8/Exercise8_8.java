import java.util.*;

import javax.rmi.CORBA.Stub;
import javax.swing.text.html.parser.DTD;
class Exercise8_8 {
    public static void main(String[] args) {
        int answer = (int)(Math.random() * 100) +1;
        int input = 0;
        int count = 0;

        do {
            count++;
            System.out.println("Make input between 1 and 100 : ");
            input = new Scanner(System.in).nextInt();

            if(answer > input){
                System.out.println("You should take bigger number");
            } else if(answer < input){
                System.out.println("You should take smaller number");
            } else{
                System.out.println("You got it");
                System.out.println("You tried " + count+ "times");
                break;
            }
        } while (true);
    }    
}
