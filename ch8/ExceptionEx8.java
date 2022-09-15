class ExceptionEx8 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try{
            System.out.println(3);
            System.out.println(0/0);
            System.out.println(4);
        } catch(ArithmeticException ae){
            ae.printStackTrace();
            System.out.println("Exception Message : " + ae.getMessage());
        }
        System.out.println(6);
    }    
}
    // 1
    // 2
    // 3
    // java.lang.ArithmeticException: / by zero
    //         at ExceptionEx8.main(ExceptionEx8.java:7)
    // Exception Message : / by zero
    // 6