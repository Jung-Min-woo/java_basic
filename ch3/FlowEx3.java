import java.util.*;
class FlowEx3 {
    public static void main(String[] args){
        int input;
        System.out.print("Put a number : ");
        
        Scanner scanner = new Scanner(System.in);
        String temp = scanner.nextLine();
        input = Integer.parseInt(temp);

        if(input==0)    System.out.println("The number you put is 0");
        else            System.out.println("The number you put is not 0");
    }
}