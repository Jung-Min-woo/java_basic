class Exercise7_19{
    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.buy(new Tv());
        b.buy(new Computer());
        b.buy(new Tv());
        b.buy(new Audio());
        b.buy(new Computer());
        b.buy(new Computer());
        b.buy(new Computer());

        b.summary();
    }
}
class Buyer{
    int money = 1000;
    Product[] cart = new Product[3];
    int i = 0;

    void buy(Product p){
        /*
         * (1) 아래의 로직에 맞게 코드를 작성하시오.
         * 1.1 가진 돈과 물건의 가격을 비교해서 가진 돈이 적으면 메서드를 종료한다.
         * 1.2 가진 돈이 충분하면, 제품의 가격을 가진 돈에서 빼고
         * 1.3 장바구니에 구입한 물건을 담는다.(add메서드 호출)
         */
        if(!(p instanceof Product)) return;
        if(money<p.price) return;
        money -= p.price;
        add(p);
    }
    void add(Product p){
        /*
         * (2) 아래의 로직에 맞게 코드를 작성하시오.
         * 1.1 i의 값이 장바구니의 크기보다 같거나 크면
         * 1.1.1 기존의 장바구니보다 2배 큰 새로운 배열을 생성한다.
         * 1.1.2 기존의 장바구니의 내용을 새로운 배열에 복사한다.
         * 1.1.3 새로운 장바구니와 기존의 장바구니를 바꾼다.
         * 1.2 물건을 장바구니(cart)에 저장한다. 그리고 i의 값을 1 증가시킨다.
         */
        if(!(p instanceof Product)) return;
        if(i>=cart.length){
            Product[] temp = new Product[cart.length*2];
            for(int i = 0 ; i<cart.length ; i++){
                temp[i] = cart[i];
            } 
            cart = temp;
        }
        cart[i++] = p;
    }
    void summary(){
        /*
         * (3) 아래의 로직에 맞게 코드를 작성하시오.
         * 1.1 장바구니에 담긴 물건들의 목록을 만들어 출력한다.
         * 1.2 장바구니에 담긴 물건들의 가격을 모두 더해서 출력한다.
         * 1.3 물건을 사고 남은 금액(money)를 출력한다.
         */
        int sum = 0;
        int i = 0;
        System.out.printf("#  Name     Price%n");
        for(Product elem : cart ){
            sum+=elem.price;
            System.out.printf("%d %-10s%-10d%n", ++i, elem.toString(), elem.price);
        }
        System.out.println("---------------------------");
        System.out.printf("Sum : %10d%n", sum);
    }
}


class Product{
    int price;

    Product(int price){
        this.price = price;
    }
}
class Tv extends Product{
    Tv(){ super(100);}
    @Override
    public String toString() {
        return "Tv";
    }
}
class Computer extends Product{
    Computer() { super(200); }
    @Override
    public String toString() {
        return "Computer";
    }
}
class Audio extends Product{
    Audio() {super(50);}
    @Override
    public String toString() {
        return "Audio";
    }
}