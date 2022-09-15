class FinallyTest3 {
    public static void main(String[] args) {
        FinallyTest3.method1();
        System.out.println("return to the main() successfully after run method1()");
    }    
    static void method1(){
        try{
            System.out.println("method1() is called");
            return;
        } catch (Exception e){
            e.printStackTrace();
        } finally{
            System.out.println("method1-finally is called");
        }
    }
}
// method1() is called
// method1-finally is called
// return to the main() successfully after run method1()