class Tv {
    String color;
    boolean power;
    int channel;

    void power() {power = !power;}
    void channelUP() {++channel;}
    void channelDOWN() {--channel;}
}
class TvTest2 {
    public static void main(String[] args){
        Tv t1 = new Tv();
        Tv t2 = new Tv();
        System.out.println("t1's channel is "+t1.channel);  
        System.out.println("t2's channel is "+t2.channel);

        t1.channel = 7;
        System.out.println("You changed t1's channel to 7");

        System.out.println("t1's channel is "+t1.channel);  
        System.out.println("t2's channel is "+t2.channel);
    }
}