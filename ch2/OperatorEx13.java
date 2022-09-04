class OperatorEx13 {
    public static void main(String[] args){
        char c1 = 'a';
        //char c2 = c1+1; ERROR!
        char c2 = 'a' + 1;          // Operation between literal, Compiler convert 'a'+1 to char automatically.
                                    // Compiler set 'a'+1 to b and compile.
                                    // When program runs, it doesn't make calculation 
        int sec = 60 * 60 * 24;     // Compiler set 60*60*24 to 86400
                                    // When program runs, it doesn't make calculation 
                                    // Consequently, it does not make delay when programmer use 60*60*24 instead of 86400
    }    
}