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
    public void shuffle(){
        SutdaCard tempCard = new SutdaCard();
        for(int i = 0 ; i < cards.length; i++){
            int idx = (int)(Math.random()*cards.length);

            tempCard = cards[i];
            cards[i] = cards[idx];
            cards[idx] = tempCard;
        }
    }
    SutdaCard pick(int index){
        if(index < 0 || index >= cards.length){
            System.out.println("pick>>Invalid index");
            return null;
        }
        return cards[index];
    }
    SutdaCard pick(){
        return cards[(int)(Math.random()*cards.length)];
    }
}
class SutdaCard{
    final int num;
    final boolean isKwang;

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

        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();

        for(int i = 0 ; i<deck.cards.length; i++ ){
            System.out.print(deck.cards[i] +  (i != deck.cards.length-1 ? "," : "") );
        }

        System.out.println();
        System.out.println(deck.pick(0));
    }    
}