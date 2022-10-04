import java.util.*;
class PriorityQueueEx {
    public static void main(String[] args) {
        Queue pq = new PriorityQueue<>();
        pq.offer(3);    //AutoBoxing : pq.offer(new Intger(3))
        pq.offer(2);
        pq.offer(1);
        pq.offer(5);
        System.out.println(pq);

        Object obj = null;

        while((obj=pq.poll())!= null)
            System.out.println(obj);
    }
}
        // [1, 3, 2, 5]
        // 1
        // 2
        // 3
        // 5