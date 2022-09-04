class OperatorEx8{
    public static void main(String[] args){
        int a = 1_000_000;
        int b = 2_000_000;
        long c = a*b;
        System.out.println(c);  //-1454759936, int*int -> int

        long d = (long)a * b; 
        System.out.println(d);  //2000000000000
    }
}