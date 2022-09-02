class CastingEx2 {
    /**
     *  [int->byte] i=10->b=10
        [int->byte] i=300->b=44
        [int->byte] b=10->i=10
        [int->byte] b=-2->i=-2
        i=11111111111111111111111111111110
     */
    public static void main(String[] args){
        int i = 10;         //0000 0000 0000 1010
        byte b = (byte)i;   //---- ---- 0000 1010
        System.out.printf("[int->byte] i=%d->b=%d%n", i, b);
        
        i=300;              //0000 0001 0010 1100
        b=(byte)i;          //---- ---- 0010 1100 : 44
        System.out.printf("[int->byte] i=%d->b=%d%n", i, b);

        b=10;               //---- ---- 0000 1010 : 10
        i=(int)b;           //0000 0000 0000 1010 : 10
        System.out.printf("[int->byte] b=%d->i=%d%n", b, i);

        b=-2;               //---- ---- 1111 1101 : -2
        i=(int)b;           //1111 1111 1111 1101 : fill 1 when it is negative number
        System.out.printf("[int->byte] b=%d->i=%d%n", b, i);

        System.out.println("i="+Integer.toBinaryString(i));
    }
}
