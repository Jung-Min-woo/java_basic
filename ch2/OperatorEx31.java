class OperatorEx31 {
    public static void main(String[] args){
        int dec = 1234;                                 //
        int hex = 0xABCD;                               //1010 1011 1100 1101
        int mask = 0xF;                                 //0000 0000 0000 1111

        System.out.printf("hex=%X%n", hex);     //ABCD
        System.out.printf("%X%n", hex & mask);  //0000 0000 0000 1101 = D
        
        hex = hex >> 4;                                 //0000 1010 1011 1100
        System.out.printf("%X%n", hex & mask);  //0000 0000 0000 1100 = C

        hex = hex >> 4;
        System.out.printf("%X%n", hex & mask);  //B

        hex = hex >> 4;
        System.out.printf("%X%n", hex & mask);  //A

        // hex=ABCD
        // D
        // C
        // B
        // A
    }
}
