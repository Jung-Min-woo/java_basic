class OperatorEx22 {
    public static void main(String[] args) {
        float f = 0.1f;
        double d = 0.1;
        double d2 = (double) f;

        System.out.printf("10.0==10.0f %b%n", 10.0 == 10.0f);
        System.out.printf("0.1==0.1f%n", 0.1 == 0.1f);
        System.out.printf("10.0f  = %19.17f%n", 10.0f);
        System.out.printf("10.0  = %19.17f%n", 10.0);
        System.out.printf("0.1f  = %19.17f%n", 0.1f);
        System.out.printf("0.1  = %19.17f%n", 0.1);
        System.out.printf("f  = %19.17f%n", f);
        System.out.printf("d  = %19.17f%n", d);
        System.out.printf("d2 = %19.17f%n", d2);
        System.out.printf("d==f     %b%n", d == f);
        System.out.printf("d==d2    %b%n", d == d2);
        System.out.printf("d2==f    %b%n", f == d2);
        System.out.printf("(float)d==f  %b%n", (float) d == f);
        System.out.printf("f==0.1f  %b%n", f == 0.1f);
        System.out.printf("d==0.1f  %b%n", d == 0.1f);
        System.out.printf("f==0.1  %b%n", f == 0.1);
        System.out.printf("d==0.1  %b%n", d == 0.1);
        // 10.0==10.0f true
        // 0.1==0.1f
        // 10.0f = 10.00000000000000000
        // 10.0 = 10.00000000000000000
        // 0.1f = 0.10000000149011612
        // 0.1 = 0.10000000000000000
        // f = 0.10000000149011612
        // d = 0.10000000000000000
        // d2 = 0.10000000149011612
        // d==f false
        // d==d2 false
        // d2==f true
        // (float)d==f true
        // f==0.1f true
        // d==0.1f false
        // f==0.1 false
        // d==0.1 true
    }
}