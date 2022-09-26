class SutdaDeck{
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];
    //20CARD
    //1 ~ 10 for each one card
    //In case that 1, 3,, 8 --> two of one is Kwang
    SutdaDeck(){
        for(int i = 0 ; i< cards.length; i++){
            cards[i] = new SutdaCard(i%10+1,  
                        ( i == 0 || i == 2 || i == 7 ?  true : false) );
        }
    }
    void shuffle(){
        SutdaCard tempCard = new SutdaCard();
        CARD_NUM * (int)(Math.random()+1);
    }
    SutdaCard pick(int index){

    }
    SutdaCard pick(){

    }
}
class SutdaCard{
    int num;
    boolean isKwang;

    SutdaCard(){
        this(1, true);
    }
    SutdaCard(int num, boolean isKwang){
        this.num = num;
        this.isKwang = isKwang;
    }
    @Override
    public String toString() {
        return num + ( isKwang ? "K" : "");
    }
}
class Exercise7_1 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();

        for(int i = 0 ; i<deck.cards.length; i++ ){
            System.out.print(deck.cards[i] +  (i != deck.cards.length-1 ? "," : "") );
        }
        
    }    
}