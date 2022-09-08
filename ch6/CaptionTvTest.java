class Tv{
    boolean power;
    int channel;
    
    void power() {power = !power;}
    void channelUp() {++channel;}
    void channeDown() {--channel;}
}
class CaptionTv extends Tv{
    boolean caption;
    void displayCaption(String text){
        if(caption) System.out.println(caption);
    }
}
class CaptionTvTest {
    public static void main(String[] args){
        CaptionTv ctv = new CaptionTv();
        ctv.channel = 10;                
    }
}
