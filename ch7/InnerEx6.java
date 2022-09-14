//If compile this file, you can find following 4 .class files
// InnerEx6$1.class
// InnerEx6$2.class
// InnerEx6$3.class
// InnerEx6.class

class InnerEx6 {
    Object iv = new Object() { void method(){} }; //Ananymous class
    static Object cv = new Object() { void method(){} }; //Ananymous class

    void myMethod(){
        Object iv = new Object(){void method(){}};
    }
}
