class Product{
    int price;
    int bonusPoint;
    // <ANSWER>
    Product(){}
    // </ANSWER>
    Product(int price){
        this.price = price;
        bonusPoint = (int)(price/10.);
    }
}
class Tv extends Product{
    Tv(){
        //super() automatically generated
    }
    @Override
    public String toString() {
        return "Tv";
    }
}
class Exercise7_5 {
    public static void main(String[] args) {
        Tv t  = new Tv();
    }
}