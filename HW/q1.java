import java.util.*;
public class q1 {
    public static void main(String[] args) {
        int n=0;
        int m=0;
        Scanner s = new Scanner(System.in);
        do {
            System.out.print("Put n, m (exit : -1) >> ");
            n = Integer.parseInt(s.next());
            m= Integer.parseInt(s.next());
            printSquareTable(n, m);    
        } while (n!=-1 && m!=-1);
    }
    public static void printSquareTable(int n, int m){
        if(n>m || n<1 || m>900) return;
        n = getUpperNearSquareNum(n);
        m = getLowerNearSquareNum(m);
        for(int i = n;  i<=m ; i++)
            System.out.printf("%d times %d = %d%n", i, i, i*i);
    }
    public static int getLowerNearSquareNum(int n){
        return (int)Math.sqrt(n);
    }
    public static int getUpperNearSquareNum(int n){
        int res = (int)Math.sqrt(n);
        return res*res < n ? res + 1 : res;        
    }
}
    // Input Output
    // n=25 m=49 5 times 5 = 25
    // 6 times 6 = 36
    // 7 times 7 = 49
    // n=1 m=23 1 times 1 = 1
    // 2 times 2 = 4
    // 3 times 3 = 9
    // 4 times 4 = 16
    // n=3 m=3