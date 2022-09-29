import java.util.*;
class q3 {
    public static void main(String[] args) {
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Input n(exit -1) >> ");
            int inp = Integer.parseInt( sc.nextLine());
            if(inp == -1) System.exit(0);
            drawFigure(inp);
        } while (true);
    }   
    public static void drawFigure(int n){
        //System.out.print(makeSpace(n-1));
        //System.out.print("*");
        //System.out.println();
        for(int i = 0 ; i< n-1; i++){
            System.out.print(makeSpace(n-1-i));
            System.out.print("*");
            if(n<=1) return;
            if(i==0) {
                System.out.println();
                continue;
            }
            System.out.print(makeSpace(2*i-1));
            System.out.print("*");
            System.out.println();
        }
        for(int i = 0; i< 2*n-1 ; i++) System.out.print("*");
        System.out.println();
    } 
    public static String makeSpace(int length){
        String temp = "";
        for(int i =0 ; i<length ; i++) temp += " ";
        return temp;
    }
}