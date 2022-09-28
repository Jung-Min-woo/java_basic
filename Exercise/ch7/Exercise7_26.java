class Outer{
    static class Inner{
        int iv = 20;
    }
}
class Exercise7_26 {
    public static void main(String[] args) {
        Outer.Inner i = new Outer.Inner();
        System.out.println(i.iv);
    }
}
