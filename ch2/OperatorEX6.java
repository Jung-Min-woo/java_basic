class OperatorEx6 {
    public static void main(String[] args){
        byte a = 10;
        byte b = 20;
        // byte c = a+b; ERROR! Datatype for (a+b) is 'int' 
        byte c =  (byte)(a+b);
        System.out.println(c);
    }
}