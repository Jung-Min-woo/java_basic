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
    }
}
