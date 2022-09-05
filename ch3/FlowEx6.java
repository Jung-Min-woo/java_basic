import java.util.*;
class FlowEx6 {
    public static void main(String[] args){
        int month = 0;
        System.out.print("Insert current month : ");
        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        month = Integer.parseInt(tmp);

        switch(month){
            case 3:
            case 4:
            case 5:
                System.out.println("Current season is Spring");
                break;
            case 6: case 7: case 8:
                System.out.println("Current season is Summer");
                break;
            case 9: case 10: case 11:
                System.out.println("Current season is Fall");
            default:
            //case 12: case 1: case 2:
                System.out.println("Current season is Winter");

        }
    }    
}