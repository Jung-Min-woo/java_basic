import java.util.*;
class Fruit {
    String name;
    int weight;

    Fruit(String name, int weight){
        this.name = name;
        this.weight = weight;
    }
    public String toString() { return name + "(" + weight + ")";}
}
class Apple extends Fruit{
    Apple(String name, int weight){
        super(name, weight);
    }
}
class Grape extends Fruit{
    Grape(String name, int weight){
        super(name, weight);
    }
}
class Box<T>{
    ArrayList<T> list = new ArrayList<>();
    void add(T item) { list.add(item);}
    T get(int i) {return list.get(i);}
    ArrayList<T> getList() {return list;}
    int size(){return list.size();}
    public String toString(){return list.toString();}
}
class FruitBox<T extends Fruit> extends Box<T>{}
class AppleComp implements Comparator<Apple>{
    public int compare(Apple t1, Apple t2){
        return t2.weight - t1.weight;
    }
}
class GrapeComp implements Comparator<Grape>{
    public int compare(Grape t1, Grape t2){
        return t2.weight - t1.weight;
    }
}
//Comparator 은 항상 <? super T>가 붙는다
class FruitComp implements Comparator<Fruit>{
    public int compare(Fruit t1, Fruit t2){
        return t2.weight - t1.weight;
    }
}
public class FruitBoxEx4 {
    public static void main(String[] args) {
        FruitBox<Apple> appleBox = new FruitBox<>();
        FruitBox<Grape> grapeBox = new FruitBox<>();
        
        appleBox.add(new Apple("GreenApple", 300));
        appleBox.add(new Apple("GreenApple", 100));
        appleBox.add(new Apple("GreenApple", 200));

        grapeBox.add(new Grape("GreenGrape", 400));
        grapeBox.add(new Grape("GreenGrape", 300));
        grapeBox.add(new Grape("GreenGrape", 200));

        Collections.sort(appleBox.getList(), new AppleComp());
        Collections.sort(grapeBox.getList(), new GrapeComp());
        System.out.println(appleBox);
        System.out.println(grapeBox);
        System.out.println();
        Collections.sort(appleBox.getList(), new FruitComp());
        Collections.sort(grapeBox.getList(), new FruitComp());
        System.out.println(appleBox);
        System.out.println(grapeBox);
    }
}
/* 결  과 */
/* 
[GreenApple(300), GreenApple(200), GreenApple(100)]
[GreenGrape(400), GreenGrape(300), GreenGrape(200)]

[GreenApple(300), GreenApple(200), GreenApple(100)]
[GreenGrape(400), GreenGrape(300), GreenGrape(200)]
 */

  /**
   * Generic Method 
   * ? = ? extends Object
   * extends T : T 이하(자녀)
   * super T : T 이상(부모)
   * 
   * static <T> void sort(List<T> list, Comparator<? super T> c)
   * 
   * static Juice makeJuice(FruitBox<? extends Fruit> box)
   * 다음과 같이 변경할 수 있음
   * static <T extends Fruit> Juice makeJuice(FruitBox<T> box)
   * 
   * public static void printAll(ArrayList<? extends Product> list, ArrayList<? extends Product> list2)
   * 다음과 같이 변경할 수 있음
   * public static <T extends Product> void printAll(ArrayList<T> list, ArrayList<T> list2)
   *  
   * 
   * public static <T extends Comparable<? super T>> void sort(List<T> list)
   * 무조건 extends 사용, 별도로 implements를 사용하지 않음을 주의한다.
   * 
   */