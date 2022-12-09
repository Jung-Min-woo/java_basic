import java.nio.channels.InterruptedByTimeoutException;
import java.util.ArrayList;

class Customer implements Runnable{
    private Table table;
    private String food;
    
    public Customer(Table table, String food) {
        this.table = table;
        this.food = food;
    }
    @Override
    public void run() {
        // TODO Auto-generated method stub
        while(true){
            try{Thread.sleep(100);} catch(InterruptedException exception){}
            String name = Thread.currentThread().getName();

            table.remove(food);
            System.out.println(name + " ate a " + food);
        }   
    }
}
class Cook implements Runnable{
    private Table table;
    Cook(Table table) { this.table = table;}
    public void run() {
        while(true){
            int idx = (int)(Math.random()*table.dishNum());
            table.add(table.dishNames[idx]);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {    
            }
        }
    }
}
class Table {
    String[] dishNames = {"donut", "donut", "burger"};
    final int MAX_FOOD = 6;
    private ArrayList<String> dishes = new ArrayList<>();

    public synchronized void add(String dish){
        while(dishes.size() >= MAX_FOOD){
            String name = Thread.currentThread().getName();
            System.out.println(name + " is waiting");
            try {
                wait();
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO: handle exception
            }
        }
        dishes.add(dish);
        notify(); // 기다리고 있는 CUST를 깨우기 위함
        System.out.println("Dishes : " + dishes.toString());
    }

    public synchronized void remove(String dishName){
        String name = Thread.currentThread().getName();
        while(dishes.size() ==0){
            System.out.println(name + " is waiting");
            try {
                wait();
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO: handle exception
            }
        }
        while(true){
            for(int i=0; i<dishes.size(); i++){
                if(dishName.equals(dishes.get(i))){
                    dishes.remove(i);
                    notify();
                    return;
                }
            }
            try {
                AbstractMethodError
                System.out.println(name + " is waiting.");
                wait();
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO: handle exception
            }
        }
    }
    public int dishNum() { return dishNames.length;}
}
class ThreadWaitEx3 {
    public static void main(String[] args) throws Exception {
        Table table = new Table();
        new Thread(new Cook(table), "COOK1").start();
        new Thread(new Customer(table, "donut"), "CUST1").start();
        new Thread(new Customer(table, "burger"), "CUST2").start();

        Thread.sleep(2000);
        System.exit(0);
    }
}
