import java.util.*;
class StackQueueEx {
    public static void main(String[] args) {
        Stack st = new Stack();
        Queue q = new LinkedList();

        st.push("0");
        st.push("1");
        st.push("2");

        q.offer("1");
        q.offer("2");
        q.offer("3");

        System.out.println("===Stack===");
        while(!st.empty()){
            System.out.println(st.pop());
        }

        System.out.println("===Queue===");
        while(!q.isEmpty()){
            System.out.println(q.poll());
        }
    }
}
    // ===Stack===
    // 2
    // 1
    // 0
    // ===Queue===
    // 1
    // 2
    // 3