class OperatorEx3 {
    public static void main(String[] args){
        int i = 5, j = 5;
        int x = 5;
        System.out.println(i++);        
        System.out.println(++j);        
        System.out.println("i="+i+"j="+j);

        x= x++ - ++x;
        System.out.printf("x= x++ - ++x, x=%d%n", x); // TODO : if I don't add %n it prints % end of result.
        // 5
        // 6
        // i=6j=6
        // x= x++ - ++x, x=-2
    }    
}
