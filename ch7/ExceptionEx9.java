class ExceptionEx9 {
    public static void main(String[] args) {
        try {
            Exception e = new Exception("This object is generated on purpose");
            throw e; // make exceptuon
            //It can be shortend like this.
            //throw new Exceptuon("This object is generated on purpose");
        } catch (Exception e) {
            System.out.println("Error message : " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Program terminated normally");
    }
}
    // Error message : This object is generated on purpose
    // java.lang.Exception: This object is generated on purpose
    //         at ExceptionEx9.main(ExceptionEx9.java:4)
    // Program terminated normally