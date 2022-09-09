class CastingTest1 {
    public static void main(String[] args) {
        Car car = null; // LHS : (추정)메모리 주소에서 읽어낼 수 있는 범위를 지정하는 것
                        // RHS : (추정)해당 메모리 주소에 데이터를 할당
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;
        FireEngine fe3 = (FireEngine)new Car(); //Exception in thread "main" java.lang.ClassCastException:
                                                //Car cannot be cast to FireEngine
                                                //at CastingTest1.main(CastingTest1.java:7)
        fe.water();
        car = fe; //possible ; car = (Car)fe; Up-casting
        //car.water(); //The method water() is undefined for the type CarJava(67108964)
        //fe2.water(); //Exception in thread "main" java.lang.NullPointerException
        fe2 = (FireEngine)car; //Down-casting
        fe2.water();
    }    
}
class Car{
    String color;
    int door;

    void drive(){
        System.out.println("drive, Brrr~");
    }
    void stop(){
        System.out.println("stop!!!");
    }
}
class FireEngine extends Car{
    void water(){
        System.out.println("water!!");
    }
}