class Car{
    String color;
    String gearType;
    int door;

    Car(){}
    Car(String c, String g, int d){
        color = c;
        gearType = g;
        door = d;
    }
}
class CarTest {
    public static void main(String[] args){
        Car c1 = new Car();
        c1.color = "white";
        c1.gearType = "auto";
        c1.door = 4;
        
        Car c2 = new Car("white", "auto", 4);

        System.out.println("c1's Color : " +c1.color+", Geartype : "+c1.gearType+", Door : " +c1.door);
        System.out.println("c2's Color : " +c2.color+", Geartype : "+c2.gearType+", Door : " +c2.door);
    }
}