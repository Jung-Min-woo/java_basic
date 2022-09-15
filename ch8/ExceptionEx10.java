class ExceptionEx10 {
    public static void main(String[] args) {
        throw new Exception();
    }    
}
// Compile Error
// ExceptionEx10.java:3: error: unreported exception Exception; must be caught or declared to be thrown
//         throw new Exception();
//         ^
// 1 error