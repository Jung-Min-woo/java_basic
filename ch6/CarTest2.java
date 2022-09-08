class Car{
    String color;
    String gearType;
    int door;

    Car(){
        //1; //Constructor call must be the first statement in a constructorJava(1207959691)
        this("white", "auto", 4);
    }
    Car(String color){
        this(color,"auto",4);
    }
    Car(String c, String g, int d){
        color = c;
        gearType = g;
        door = d;
    }
}
class CarTest2 {
    public static void main(String[] args){
        Car c1 = new Car();
        c1.color = "white";
        c1.gearType = "auto";
        c1.door = 4;
        
        Car c2 = new Car("white", "auto", 4);
        Car c3 = new Car("blue");
        System.out.println("c1's Color : " +c1.color+", Geartype : "+c1.gearType+", Door : " +c1.door);
        System.out.println("c2's Color : " +c2.color+", Geartype : "+c2.gearType+", Door : " +c2.door);
        System.out.println("c3's Color : " +c3.color+", Geartype : "+c3.gearType+", Door : " +c3.door);
    }
}