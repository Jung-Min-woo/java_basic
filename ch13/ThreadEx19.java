class ThreadEx19 {
    static long startTime = 0;
    public static void main(String[] args) {
        ThreadEx19_1 th1 = new ThreadEx19_1();
        ThreadEx19_2 th2 = new ThreadEx19_2();
        th1.start();
        th2.start();
        startTime = System.currentTimeMillis();

        try {
            th1.join(); //join 메서드는 중간에 다른 쓰레드의 작업을 참여(join)시킨다는 의미에서 지어진 이름이다.
            th2.join();
        } catch (InterruptedException e) {
            // TODO: handle exception
        }
        System.out.println("소요시간 : "+(System.currentTimeMillis() - ThreadEx19.startTime));
    }    
}
class ThreadEx19_1 extends Thread{
    public void run() {
        for(int i =0 ; i<300 ; i++){
            System.out.print(new String("-")); //"new String" is for delay
        }
    }
}
class ThreadEx19_2 extends Thread{
    public void run(){
        for(int i =0; i<300; i++){
            System.out.print(new String("|"));
        }
    }
}