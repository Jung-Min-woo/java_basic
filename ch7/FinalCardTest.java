class Card{
    final int NUMBER;
    final String KIND;
    static int width = 100;
    static int height = 250;

    Card(String kind, int num){
        //Initialization of 
        KIND = kind;
        NUMBER = num;
    }
    Card(){
        this("HEARTS", 1);
    }
    public String toString(){
        return KIND + "" + NUMBER;
    }
}
class FinalCardTest{
    public static void main(String[] args){
        Card c = new Card("HEART", 10);
        //c.NUMBER = 5; //ERROR, NUMBER is final int
        System.out.println(c.KIND);
        System.out.println(c.NUMBER);
        System.out.println(c); //System.out.println(c.toString());
        //if there is no toString, it prints Card@4aa298b7;
    }
}