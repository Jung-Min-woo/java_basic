import javax.swing.JOptionPane;
class ThreadEx14 {
    public static void main(String[] args) {
        ThreadEx14_1 th1 = new ThreadEx14_1();
        th1.start();
        
        String input = JOptionPane.showInputDialog("Make any inputs");
        System.out.println("your input is "+ input);
        th1.interrupt();
        System.out.println("isInterrupted : " +th1.isInterrupted());
    }    
}
class ThreadEx14_1 extends Thread{
    public void run() {
        int i = 10;
        while(i !=0 && !isInterrupted()){
            System.out.println(i--);
            try {
                Thread.sleep(1000); //1초 후 Exception이 발생함
            } catch (InterruptedException e) {
                // TODO: handle exception
                interrupt();
            } 
        }
    }
}
