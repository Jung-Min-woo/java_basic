import java.util.*;
class PolyArgumentTest3 {
    
}
class Product{
    int price;
    int bonusPoint;

    Product(int price){
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }
}
class Tv extends Product{
    Tv(){
        super(100);
    }
    public String toString(){
        return "Tv";
    }
}
class Computer extends Product{
    Computer(){
        super(200);
    }
    public String toString(){
        return "Computer";
    }   
}
class Audio extends Product{
    Audio() { super(50);}
    public String toString() {
        return "Audio";
    }
}
class Buyer{
    int money = 1000;
    int bonusPoint = 0;
    Vector item = new Vector<>();
    int i = 0;

    void buy(Product p){
        if(money < p.price){    // Polymorphism
            System.out.println("There is no balance, so you can't buy product");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        item.add(p);
        System.out.println("You bought " + p);
    }

    void refund(Product p){
        if(item.remove(p)){
            money+=p.price;
            bonusPoint -= p.bonusPoint;
            System.out.println("You refunded" + p);
        }
        else{
            System.out.println("There is no product at list you bought");
        }
    }

    void summary(){
        int sum = 0;
        String itemList = "";

        for(int i = 0; i<item.size(); i++){
            Product p = (Product)item.get(i);
            sum += p.price;
            itemList += (i==0 ? "" : ", ") + p;
        }
        System.out.println("Total : "+sum);
        System.out.println("You bought : "+ itemList);
    }
}