/* TODO : abstract 써서 다시 구현할 것. */
import java.lang.reflect.Constructor;

abstract class Unit{
    int x, y;
    Unit(){}
    Unit(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void move(int x, int y){
        this.x += x;
        this.y += y;
    }
    public void stop(){

    }
}
class Marine extends Unit{
    Marine(){}
    Marine(int x, int y){
        super(x, y);
    }
}
class Tank extends Unit{
    Tank(){}
    Tank(int x, int y){
        super(x, y);
    }
}
class Dropship extends Unit{
    Dropship(){}
    Dropship(int x, int y){
        super(x,y);
    }
}
class Exercise7_17 {
    public static void main(String[] args) {
        
    }
}
