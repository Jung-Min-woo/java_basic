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

class Buyer{
    int money = 1000;
    int bonusPoint = 0;

    void buy(Product p){
        if(money < p.price){    // Polymorphism
            System.out.println("There is no balance, so you can't buy product");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        System.out.println("You bought " + p);
    }
}
class PolyArgumentTest{
    public static void main(String[] args) {
        Buyer b = new Buyer();

        b.buy(new Tv());
        b.buy(new Computer());

        System.out.println("Balance : "+b.money);
        System.out.println("Bonus Point : "+b.bonusPoint);
    }
}
        // You bought Tv
        // You bought Computer
        // Balance : 700
        // Bonus Point : 30