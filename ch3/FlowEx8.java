import java.util.*;
class FlowEx8 {
    public static void main(String[] args){
        char gender;
        String regNo = "";
        
        System.out.print("Insert your Resident Registration Number : ");
        Scanner scanner = new Scanner(System.in);
        regNo = scanner.nextLine();

        gender = regNo.charAt(7);
        switch(gender){
            case '1':
            case '3':
                System.out.println("You're a man");
                break;
            case '2':
            case '4':
                System.out.println("You're a woman");
                break;
            default :
                System.out.println("Input number is invalid");
        }
    }
}
