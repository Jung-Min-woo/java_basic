class SuperTest2 {
    public static void main(String[] args){
        Child c = new Child();
        c.method();
    }    
}
class Parent{
    int x = 10;
    static int xx = 30;
}
class Child extends Parent{
    int x = 20;
    static int xx = 20;
    void method(){
        System.out.println("x="+x);
        System.out.println("this.x="+this.x);
        System.out.println("super.x="+super.x);
        //WARNING : The static field Parent.xx should be accessed in a static wayJava(570425420)
        System.out.println("static/this.xx="+this.xx); 
        System.out.println("static/super.xx="+super.xx);
    }
}