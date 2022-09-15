import javax.management.RuntimeErrorException;

class ExceptionEx11 {
    public static void main(String[] args) {
        throw new RuntimeException();
    }    
}
    // Exception in thread "main" java.lang.RuntimeException
    //         at ExceptionEx11.main(ExceptionEx11.java:5