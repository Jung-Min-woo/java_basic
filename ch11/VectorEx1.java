import java.util.*;
class VectorEx1 {
    public static void main(String[] args) {
        Vector v = new Vector(5); // Capacity 5
        v.add("1");
        v.add("2");
        v.add("3");
        print(v);

        v.trimToSize(); // Now capacity == v.size()
        System.out.println("===After trimToSize() ===");
        print(v);

        v.ensureCapacity(6);
        System.out.println("===After ensureCapacity(6)===");
        print(v);

        v.setSize(7);
        System.out.println("===After setSize(7)===");
        print(v);

        v.clear();
        System.out.println("===After clear()===");
        print(v);
    }
    public static void print(Vector v) {
        System.out.println(v);
        System.out.println("size :" + v.size());
        System.out.println("capacity :"+v.capacity());
    }
}
    // [1, 2, 3]
    // size :3
    // capacity :5
    // ===After trimToSize() ===
    // [1, 2, 3]
    // size :3
    // capacity :3
    // ===After ensureCapacity(6)===
    // [1, 2, 3]
    // size :3
    // capacity :6
    // ===After setSize(7)===
    // [1, 2, 3, null, null, null, null]
    // size :7
    // capacity :12
    // ===After clear()===
    // []
    // size :0
    // capacity :12