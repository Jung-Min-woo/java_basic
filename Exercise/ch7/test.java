class test {
    public static void main(String[] args) {
        Parent a = new Parent();
        Child b = new Child();
        System.out.println(a.add(1, 3));
        System.out.println(b.add(3));
    }
}
class Parent{
     public int add(int a, int b){
        return a + b;
    }
}
class Child extends Parent{
    public int add(int a) {
        // TODO Auto-generated method stub
        return super.add(a, 3);
    }
}