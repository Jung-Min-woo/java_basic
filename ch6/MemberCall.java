//It is recommended to use class(static) variable/method without instance variable/method
class MemberCall {
    int iv = 10;
    static int cv = 20;
    
    int iv2 = cv;
    //static int cv2 = iv; //ERROR! Class variable cannot use instance variable.
    static int cv2 = new MemberCall().iv; // it can be possible if MemberCall is declared

    static void staticMethod(){
        System.out.println(cv);
        // System.out.println(iv); //ERROR! Class method cannot use an instance variable
        MemberCall c = new MemberCall();
        System.out.println(c.iv);   //Now, it is valid expression because MemberCall is declared.
    }
    void instanceMethod(){
        System.out.println(cv); //instanceMethod can use static variable
        System.out.println(iv); //instanceMethod can use instance variable because it can be used when MemberCall is declared
    }
    static void staticMethod2(){
        staticMethod();
        // instanceMehod(); //ERROR! Class method cannot call instance method.
        MemberCall c = new MemberCall();
        c.instanceMethod();
    }
    void instanceMethod2(){
        staticMethod();
        instanceMethod();
    }
}