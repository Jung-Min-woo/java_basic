import java.util.*;
public class IteratorEx2 {
    public static void main(String[] args) {
        ArrayList original = new ArrayList<>(10);
        ArrayList copy1 = new ArrayList<>(10);
        ArrayList copy2 = new ArrayList<>(10);

        for(int i =0; i<10; i++) original.add(i+"");
        Iterator it = original.iterator();

        while(it.hasNext()) copy1.add(it.next());

        System.out.println("=Original -> Copy1 (Copy)=");
        System.out.println("original:"+original);
        System.out.println("copy1:"+copy1);
        System.out.println();
        
        it = original.iterator(); //iterator cannot be reused, so it has to be regenerated.
        while(it.hasNext()){
            copy2.add(it.next());
            it.remove();
        }

        System.out.println("=Orignal -> Copy2 (Move)=");
        System.out.println("original:"+original);
        System.out.println("copy2:"+copy2);
    }
}
    // =Original -> Copy1 (Copy)=
    // original:[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
    // copy1:[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

    // =Orignal -> Copy2 (Move)=
    // original:[]
    // copy2:[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]