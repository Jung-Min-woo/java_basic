import java.math.BigInteger;

class MathEx2 {
    public static void main(String[] args) {
        int i = Integer.MIN_VALUE;

        System.out.println("i="+i);
        System.out.println("-i="+(-i));

        try{
            System.out.printf("negateExact(%d)=%d%n", 10, Math.negateExact(10));
            System.out.printf("negateExact(%d)=%d%n", -10, Math.negateExact(-10));
            System.out.printf("negateExact(%d)=%d%n", i, Math.negateExact(i));
        } catch(ArithmeticException e){
            System.out.println("!!!ArithmeticException caught!!!");
            //(long)i and call negateExact(long a)
            //negateExact method is provided by above JDK1.8 
            System.out.printf("negateExact(%d)=%d%n", (long)i, Math.negateExact((long)i));
        }
    }    
}
        // i=-2147483648
        // -i=-2147483648
        // negateExact(10)=-10
        // negateExact(-10)=10
        // !!!ArithmeticException caught!!!
        // negateExact(-2147483648)=2147483648