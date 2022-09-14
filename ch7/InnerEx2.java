class InnerEx2 {
    class InstanceInner {}
    static class StaticInner {}    

    //It is accessible between instance members
    InstanceInner iv = new InstanceInner();
    //It is accessible between static members
    static StaticInner cv = new StaticInner();

    static void staticMethod(){
        //Static member cannot access to instance members
//      InstanceInner obj1 = new InstanceInner();
        //No enclosing instance of type InnerEx2 is accessible. Must qualify the allocation with an enclosing instance of type InnerEx2 (e.g. x.new A() where x is an instance of InnerEx2).Java(16777237)
        
        StaticInner obj2 = new StaticInner();

        //If you want to access to InstanceInner, then following statement is possible
        InnerEx2 outer = new InnerEx2();
        InstanceInner obj1 = outer.new InstanceInner();
    }
    void instanceMethod(){
        InstanceInner obj1 = new InstanceInner();
        StaticInner obj2 = new StaticInner();

        //LocalInner is not accessible outside local area
//      LocalInner lv = new LocalInner();
    }
    void MyMethod(){
        class LocalInner{}
        LocalInner lv = new LocalInner();
    }
}