class Tv {
    String color;
    boolean power;
    int channel;

    void power() {power = !power;}
    void channelUP() {++channel;}
    void channelDOWN() {--channel;}
}
class TvTest{
    public static void main(String[] args){
        Tv t;
        t = new Tv();
        t.channel = 7;
        t.channelDOWN();
        System.out.println("Current channel is "+t.channel);
    }
}