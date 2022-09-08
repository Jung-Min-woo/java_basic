class Car{
    String color;
    String gearType;
    int door;

    Car(){
        //1; //Constructor call must be the first statement in a constructorJava(1207959691)
        this("white", "auto", 4);
    }
    Car(Car c){
        this(c.color, c.gearType, c.door);
    }
    Car(String color){
        this(color,"auto",4);
    }
    Car(String color, String gearType, int door){
    // FLAG!!!
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}
class CarTest3 {
    public static void main(String[] args){
        Car c1 = new Car();
        Car c2 = new Car(c1);
    
        c1.door = 20;
        System.out.println("c1's Color : " +c1.color+", Geartype : "+c1.gearType+", Door : " +c1.door);
        System.out.println("c2's Color : " +c2.color+", Geartype : "+c2.gearType+", Door : " +c2.door);
        // c1's Color : white, Geartype : auto, Door : 20
        // c2's Color : white, Geartype : auto, Door : 4
    }    
}