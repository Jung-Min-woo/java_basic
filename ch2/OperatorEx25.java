import java.util.*;
class OperatorEx25 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        char ch = ' ';

        System.out.printf("Put a charater");
        String input = scanner.nextLine();
        ch=input.charAt(0);
        if('0'<=ch&&ch<='9') 
            System.out.printf("Character you put in is a number%n");
        if('a'<=ch&&ch<='z' || 'A'<=ch&&ch<='Z')
            System.out.printf("Character you put in is a alphabet%n");
    }    
}
