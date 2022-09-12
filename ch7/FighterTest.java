class FighterTest {
    public static void main(String[] args) {
        Fighter f = new Fighter();

        if ( f instanceof Unit)
            System.out.println("f is son of Unit class");
        if( f instanceof Fightable)
            System.out.println("f implements Fightable interface");
        if (f instanceof Movable)
            System.out.println("f implements Movable interface");
        if (f instanceof Attackable)
            System.out.println("f implements Attackable interface");
        if (f instanceof Object)
            System.out.println("f is son of Object class");
    }
}
class Fighter extends Unit implements Fightable {
    public void move(int x, int y){}    //must put public prefix(조상 메서드보다 넓은 범위의 접근제어자를 지정해야한다.)
    public void attack(Unit u){}        
}
class Unit{
    int currentHP;
    int x, y;
}
interface Fightable extends Movable, Attackable{}
interface Movable{void move(int x, int y);} // == public abstract void move(int x, int y);
interface Attackable{void attack(Unit u);}  // == public abstract void attack(Unit u);
//for member variable : public static final NAME_VAR (omittable)
//for method : public abstract void NAME_METHOD (omittable) 
// ** Exception : static and default method (I can't understand what it means)

    // f is son of Unit class
    // f implements Fightable interface
    // f implements Movable interface
    // f implements Attackable interface
    // f is son of Object class