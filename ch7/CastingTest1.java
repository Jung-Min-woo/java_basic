class CastingTest1 {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;
        
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