// ii.iv : 100
// Outer.StaticInner.cv : 300
// si.iv : 200

class Outer{
    class InstanceInner{
        int iv = 100;
    }
    static class StaticInner{
        int iv = 200;
        static int cv = 300;
    }
    void MyMethod(){
        class LocalInner{
            int iv = 400;
        }
    }
}
public class InnerEx4 {
    public static void main(String[] args) {
        //If you want to generate instance of instance clas, you should generate instance of outer class first.
        Outer oc = new Outer();
        Outer.InstanceInner ii = oc.new InstanceInner();

        System.out.println("ii.iv : " + ii.iv);
        System.out.println("Outer.StaticInner.cv : " + Outer.StaticInner.cv);

        //It is not necessary to generate outer class when inner class is static
        Outer.StaticInner si = new Outer.StaticInner();
        System.out.println("si.iv : " + si.iv);
    }
}