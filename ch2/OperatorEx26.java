class OperatorEx26 {
    public static void main(String[] args){
        int a = 5;
        int b = 0;

        System.out.printf("a=%d, b=%d%n",a, b);
        System.out.printf("a!=0 || ++b!=0 = %b%n", a!=0 || ++b!=0); //++b!=0 does not proceed.
        System.out.printf("a=%d, b=%d%n",a, b);                     
        System.out.printf("a==0 && ++b!=0 = %b%n", a==0 && ++b!=0); //++b!=0 does not proceed.
        System.out.printf("a=%d, b=%d%n", a, b);
        // a=5, b=0
        // a!=0 || ++b!=0 = true
        // a=5, b=0
        // a==0 && ++b!=0 = false
        // a=5, b=0
    }
}
