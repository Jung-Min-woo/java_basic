class ExceptionEx13 {
    public static void main(String[] args) {
        method1();
    }
    static void method1(){
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("method1 handled exception");
            e.printStackTrace();
        }
    }
}
// method1 handled exception
// java.lang.Exception
//         at ExceptionEx13.method1(ExceptionEx13.java:7)
//         at ExceptionEx13.main(ExceptionEx13.java:3)