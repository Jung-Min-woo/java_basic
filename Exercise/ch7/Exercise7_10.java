class MyTv2 {
    boolean isPowerOn;
    int channel;
    int volume;
	int previousChannel;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    public void setChannel(int channel) {
        if(channel < MIN_CHANNEL || channel > MAX_CHANNEL ){
            System.out.println("Invalid Channel");
            return;
        }    
        this.previousChannel = this.channel;
        this.channel = channel;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public int getChannel() {
        return channel;
    }
    public int getVolume() {
        return volume;
    }
	public void gotoPreviousChannel(){
		int temp = this.channel;
        this.channel = previousChannel;
		previousChannel = temp;
	}
}
class Exercise7_10{
    public static void main(String[] args) {
        MyTv2 t = new MyTv2();
        t.setChannel(10);
        System.out.println("CH:"+t.getChannel());
        t.setVolume(20);
        System.out.println("VOL:"+t.getVolume());   
        t.setChannel(20);
        System.out.println("CH:"+t.getChannel());

        t.gotoPreviousChannel();
        System.out.println("CH:"+t.getChannel());
        t.gotoPreviousChannel();
        System.out.println("CH:"+t.getChannel());
    }
}
    // CH:10
    // VOL:20
    // CH:20
    // CH:10
    // CH:20