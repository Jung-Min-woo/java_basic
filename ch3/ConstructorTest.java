class Data1{
    int value;
}
class Data2{
    int value;
    Data2(int x){
        value = x;
    }//Compiler does not make basic constructor if there already exists.
}
class ConstructorTest {
    public static void main(String[] args){
        Data1 d1 = new Data1();
        Data2 d2 = new Data2(); //ERROR OCCURED!
        // ConstructorTest.java:13: error: constructor Data2 in class Data2 cannot be applied to given types;
        // Data2 d2 = new Data2();
        //            ^
        // required: int
        // found: no arguments
        // reason: actual and formal argument lists differ in length
        // 1 error
    }   

}
