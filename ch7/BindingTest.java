class BindingTest {
    public static void main(String[] args) {
        Parent p = new Parent();
        Parent pp = new Child();
        Child c = new Child();

        System.out.println("p.x="+p.x);
        p.method();
        System.out.println("pp.x="+pp.x);
        pp.method();
        System.out.println("c.x="+c.x);
        c.method(); 
    }
}
        // p.x=100
        // Parent Method
        // pp.x=100
        // Child Method
        // c.x=200
        // Child Method
class Parent{
    int x = 100;
    void method(){
        System.out.println("Parent Method");
    }
}
class Child extends Parent{
    int x = 200;
    void method(){
        System.out.println("Child Method");
    }
}