class OperatorEx7 {
    public static void main(String[] args){
        byte a = 10;                //      0000 1010  0A
        byte b = 30;                //      0001 1110  1E
        byte c = (byte)(a*b);       //(0001)0010 1100 12C --> 2C : 44 
        System.out.println(c);   
    }
}