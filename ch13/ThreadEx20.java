class ThreadEx20 {
    public static void main(String[] args) {
        ThreadEx20_1 gc = new ThreadEx20_1();
        gc.setDaemon(true);
        gc.start();

        int requiredMemory = 0;
        for(int i=0; i<20 ; i++){
            requiredMemory = (int)(Math.random() * 10)*20;

            if(gc.freeMemory() <requiredMemory 
                || gc.freeMemory() < gc.totalMemory() * 0.4){
                    gc.interrupt();
            }
            gc.usedMemory += requiredMemory;
            System.out.println("usedMemory:"+gc.usedMemory);
        }
    }    
}
class ThreadEx20_1 extends Thread{
    final static int MAX_MEMORY = 1000;
    int usedMemory = 0;

    public void run() {
        while(true){
            try {
                Thread.sleep(10* 1000);
            } catch (InterruptedException e) {
                // TODO: handle exception
                System.out.println("Awaken by interrupt();");
            }
            gc();
            System.out.println("Garbage Collected. Free Memory : "+freeMemory());
        }
    }
    public void gc() {
        usedMemory -= 300;
        if(usedMemory < 0) usedMemory = 0;
    }
    public int totalMemory() {return MAX_MEMORY;}
    public int freeMemory() {
        return MAX_MEMORY - usedMemory ;
    }
}
// usedMemory:0
// usedMemory:80
// usedMemory:100
// usedMemory:220
// usedMemory:380
// usedMemory:480
// usedMemory:600
// usedMemory:620
// usedMemory:700
// usedMemory:760
// usedMemory:760
// Awaken by interrupt();
// usedMemory:780
// usedMemory:580
// usedMemory:660
// usedMemory:680
// usedMemory:720
// usedMemory:900
// usedMemory:900
// usedMemory:980
// usedMemory:1080 --> 실제로 1000이 넘어감, 이걸 방지하기 위해 gc.join() --> gc.join(100) 으로 고쳐 main이 기다리게 한다.
// Garbage Collected. Free Memory : 520
// Awaken by interrupt();
// Garbage Collected. Free Memory : 220