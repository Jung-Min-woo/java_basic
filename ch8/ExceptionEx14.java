class ExceptionEx14 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("main method handled exception");
            e.printStackTrace();
        }
    }    
    static void method1() throws Exception{
        throw new Exception();
    }
}
// main method handled exception
// java.lang.Exception
//         at ExceptionEx14.method1(ExceptionEx14.java:11)
//         at ExceptionEx14.main(ExceptionEx14.java:4)