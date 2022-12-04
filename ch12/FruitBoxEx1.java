import java.util.ArrayList;

class Fruit {public String toString() {return "Fruit";}}
class Apple extends Fruit {public String toString(){return "Apple";}}
class Grape extends Apple {public String toString(){return "Grape";}}
class Toy {public String toString(){return "Toy";}}

class FruitBoxEx1{
    public static void main(String[] args) {
        Box<Fruit> fruitBox = new Box<Fruit>();
        Box<Apple> appleBox = new Box<>();
        Box<Toy> toyBox = new Box<>();
        Box<Grape> grapeBox = new Box<>();
        //Box<Grape> testBox = new Box<Apple>(); Error 타입 불일치
       
        fruitBox.add(new Fruit());
        fruitBox.add(new Apple()); //가능 void add(Fruit item);
        
        appleBox.add(new Apple());
        appleBox.add(new Apple());
//      appleBox.add(new Toy()); // Error! Box<Apple>에는 Apple만 담을 수 있음

        toyBox.add(new Toy());
//      toyBox.add(new Apple()); // Error! Box<Toy>에는 Apple을 담을 수 없음

        System.out.println(fruitBox);
        System.out.println(appleBox);
        System.out.println(toyBox);
    }
}
class Box<T> {
    ArrayList<T> list = new ArrayList<T>();
    void add(T item) {list.add(item);}
    T get(int i) {return list.get(i);}
    int size() {return list.size();}
    public String toString() {return list.toString();}
}

// [Fruit, Apple]
// [Apple, Apple]
// [Toy]