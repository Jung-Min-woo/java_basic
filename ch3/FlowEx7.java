import java.util.*;
class FlowEx7 {
    public static void main(String[] args){
        int user, com;
        System.out.print("Insert among Scissor(1), Rock(2), Paper(3) : ");
        Scanner scanner = new Scanner(System.in);
        String temp = scanner.nextLine();
        user = Integer.parseInt(temp);

        com = (int)(Math.random()*3)+1; // 0<= Math.random <1
        System.out.println("Your input is "+user);
        System.out.println("Com's input is "+com);

        switch(user-com){
            case 2: case -1:
                System.out.println("You're lose");
                break;
            case 1: case -2:
                System.out.println("You're win");
                break;
            case 0:
                System.out.println("Draw");
        }
    }
}
