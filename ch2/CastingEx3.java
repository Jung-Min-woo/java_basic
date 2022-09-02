class CastingEx3 {
    /**
     *  f=9.123456954956055000
        d=9.123456700000000000
        d2=9.123456954956055000
     */
    public static void main(String[] args){
        float f = 9.1234567f;
        double d = 9.1234567;
        double d2 = (double)f;

        System.out.printf("f=%20.18f\n", f);
        System.out.printf("d=%20.18f\n", d);
        System.out.printf("d2=%20.18f\n", d2);  //There is no change, because var f is already fixed as float.
    }    
}