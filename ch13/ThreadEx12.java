class ThreadEx12 {
    public static void main(String[] args) {
        ThreadEx12_1 th1 = new ThreadEx12_1();
        ThreadEx12_2 th2 = new ThreadEx12_2();

        th1.start();
        th2.start();

        try {
            /**
             * sleep()은 현재 실행중인 thread에 적용되기 때문에 th1이 아닌 main에 적용된다.
             * 따라서 쓰레드를 정지시키고 싶을 때는 Thread.sleep(time)을 적용하는 것이 권장된다.
             */
            th1.sleep(2000);
        } catch (InterruptedException e) {
            // TODO: handle exception
        }
        System.out.println("main terminated");
    }
}
class ThreadEx12_1 extends Thread{
    public void run() {
        for(int i=0 ;i<100 ; i++){
            System.out.print("-");
        }
        System.out.print("<<th1 terminated>>");
    }
}
class ThreadEx12_2 extends Thread{
    public void run() {
        for(int i=0; i<300; i++){
            System.out.print("|");
        }
        System.out.print("<<th2 terminated>>");
    }
}