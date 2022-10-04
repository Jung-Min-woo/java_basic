import java.util.*;
class ArrayListLinkedListTest {
    public static void main(String[] args) {
        List al = new ArrayList(2000000);
        List ll = new LinkedList();

        System.out.println("===순차적 추가===");
        System.out.println("ArrayList : " + add1(al));
        System.out.println("LinkedList : " + add1(ll));
        System.out.println();
        
        System.out.println("===중간에 추가===");
        System.out.println("ArrayList : " + add2(al));
        System.out.println("LinkedList : " + add2(ll));
        System.out.println();
        
        System.out.println("===중간에 삭제===");
        System.out.println("ArrayList : " + remove2(al));
        System.out.println("LinkedList : " + remove2(ll));
        System.out.println();
        
        System.out.println("===순차적 삭제===");
        System.out.println("ArrayList : " + remove1(al));
        System.out.println("LinkedList : " + remove1(ll));
        System.out.println();        
    }    
    public static long add1(List list) {
        long start = System.currentTimeMillis();
        for(int i=0; i<1000000; i++) list.add(i+"");
        long end = System.currentTimeMillis();
        return end - start;
    }
    public static long add2(List list){
        long start = System.currentTimeMillis();
        for(int i =0; i<10000; i++) list.add(500, "X");
        long end = System.currentTimeMillis();
        return end - start;
    }
    public static long remove1(List list){
        long start = System.currentTimeMillis();rrrfd
        for(int i=list.size()-1; i>=0 ; i--) list.remove(i);
        long end = System.currentTimeMillis();
        return end - start;
    }
    public static long remove2(List list){
        long start = System.currentTimeMillis();
        for(int i=0; i<10000; i++) list.remove(i);
        long end = System.currentTimeMillis();
        return end - start;
    }
}
    // ===순차적 추가===
    // ArrayList : 104
    // LinkedList : 79

    // ===중간에 추가===
    // ArrayList : 3347
    // LinkedList : 17

    // ===중간에 삭제===
    // ArrayList : 2178
    // LinkedList : 134

    // ===순차적 삭제===
    // ArrayList : 7
    // LinkedList : 13