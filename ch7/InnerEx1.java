//100
//200
class InnerEx1 {
    class InstanceInner{
        int iv = 100;
        //static int cv = 100;
        // The field cv cannot be declared static in a """non-static inner type"""
        //, unless """initialized with a constant""" expressionJava(33554778)
        final static int CONST = 100; 
    }
    static class StaticInner{
        int iv = 200;
        static int cv = 200;
    }
    void MyMethod(){
        class LocalInner{
            int iv = 300;
            //static int cv = 300;
            final static int CONST = 300;
        }
    }
    public static void main(String[] args) {
        System.out.println(InstanceInner.CONST);
        System.out.println(StaticInner.cv);
    }
}