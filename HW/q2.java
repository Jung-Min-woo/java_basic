import java.util.*;
class q2 {
    static final double phi = (1+ Math.sqrt(5))/2.;
    static final double phi_ = (1- Math.sqrt(5))/2.;
    public static void main(String[] args) {
        int input = 0;
        do{
            Scanner s = new Scanner(System.in);
            System.out.print("Put n(exit:-1) >> ");
            input = Integer.parseInt(s.nextLine());
            if(input== -1) System.exit(0);
            printFibonacciNumber(input);
        }while(true);
    }   
    public static void printFibonacciNumber(int n){
        int sum= 0;
        for(int i=0 ; i<n; i++){
            //int temp = fibo_recursive(i);
            int temp = fibo_closed(i);
            sum += temp%100000;
            System.out.print(temp+ " ");
        }
        System.out.printf("%nSum : %d%n", sum);
    }
    //Recursive Version
    public static int fibo_recursive(int n) {
        if( n == 0) return 0;
        else if(n==1) return 1;
        else{
            return fibo_recursive(n-1) + fibo_recursive(n-2);
        }
    }
    //Closed-form Version
    public static int fibo_closed(int n){
        return (int)( (Math.pow(phi, n) - Math.pow(phi_, n) )/ Math.sqrt(5) );
    }
}
