import java.lang.reflect.GenericArrayType;

public class testhiding{
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        System.out.println(a.getA());
        System.out.println(b.getA());
        System.out.println(a.a);
        System.out.println(b.a);
        System.out.println(b.ab());
    }    
}
class A{
    int a = 1;
    int b = 2;
    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }
}
class B extends A{
    double a = 1.3;
    double b = 1.4;
    
    public double ab() {
        return a+b;
    }
}