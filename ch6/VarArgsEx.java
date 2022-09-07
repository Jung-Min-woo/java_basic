class VarArgsEx {
    public static void main(String[] args){
        String[] strArr = {"100", "200", "300"};

        System.out.println(concatenate("", "100", "200", "300"));
        System.out.println(concatenate("-", strArr));
        System.out.println(concatenate(",", new String[]{"1","2","3"})); //It cannot be written as sout(concatenate(",", {"1","2","3"}))
        System.out.println("[" + concatenate(",", new String[0])+"]");
        System.out.println("[" + concatenate(",")+"]");
        System.out.println("TEST : " + concatenate(1, new String[]{"HELLO", "JAVA"}) );
    }

    static String concatenate(String delim, String... args){
        String result = "";
        for(String str : args) result += str + delim;
        return result;
    }
    /* Overload */
    static String concatenate(int delim, String... args){
        String result = "";
        for(String str : args) result += str + Integer.toString(delim);
        return result;
    }
    // /* Overload */
    // static String concatenate(String... args){
    //     return concatenate(0, args);
    // }

    // /* Overload */
    // static String concatenate(String... args){
    //     return concatenate("", args);
    // }
    // /* ERROR MSG */
    // VarArgsEx.java:5: error: reference to concatenate is ambiguous //!!!!!!
    //     System.out.println(concatenate("", "100", "200", "300"));
    //                         ^
    // both method concatenate(String,String...) in VarArgsEx and method concatenate(String...) in VarArgsEx match
    // VarArgsEx.java:9: error: reference to concatenate is ambiguous
    //     System.out.println("[" + concatenate(",")+"]");
    //                                 ^
    // both method concatenate(String,String...) in VarArgsEx and method concatenate(String...) in VarArgsEx match
    // 2 errors
}
    // 100200300
    // 100-200-300-
    // 1,2,3,
    // []
    // []