import java.util.*;
public class TreeSetLotto {
    public static void main(String[] args) {
        Set set = new TreeSet();
        for(int i=0; set.size()<6;i++){
            int num = (int)(Math.random()*45)+1;
            set.add(num);
        }
        System.out.println(set);
    }
    //Sorted when saved in TreeSet.
    //As a result, sorting is not needed.
}
// [2, 8, 15, 25, 30, 35]