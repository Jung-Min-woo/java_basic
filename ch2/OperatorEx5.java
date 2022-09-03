class OperatorEx5 {
    public static void main(String[] args){
        int a = 10;
        int b=4;
        System.out.printf("%d + %d = %d%n", a, b, a+b);           
        System.out.printf("%d - %d = %d%n", a, b, a-b);           
        System.out.printf("%d * %d = %d%n", a, b, a*b);           
        System.out.printf("%d / %d = %d%n", a, b, a/b);           
        System.out.printf("%f / %d = %f%n", (float)a, b, (float)a/b);           
        System.out.printf("%d / %f = %f%n", a, (float)b, a/(float)b); //If use %d for float type, it makes errors.                  
        //ERROR for A / 0  :: ArithmeticException
        //It is okay for A / 0.0
        //test for INF
        System.out.printf("DEF / +0.0 = %f%n", a/0.0f);
        System.out.printf("DEF / -0.0 = %f%n", a/-0.0f);
        // 10 + 4 = 14
        // 10 - 4 = 6
        // 10 * 4 = 40
        // 10 / 4 = 2
        // 10.000000 / 4 = 2.500000
        // 10 / 4.000000 = 2.500000
        // DEF / +0.0 = Infinity
        // DEF / -0.0 = -Infinity
    }
}