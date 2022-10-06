import java.util.*;
class ComparatorEx {
    public static void main(String[] args) {
        String[] strArr = {"cat", "Dog", "lion", "tiger"};
        Arrays.sort(strArr);
        System.out.println("strArr="+Arrays.toString(strArr));
        
        Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); //Do not regard upper/lower
        System.out.println("strArr="+Arrays.toString(strArr));
        
        Arrays.sort(strArr, new Descending()); //In adverse
        System.out.println("strArr="+Arrays.toString(strArr));
    }
}
class Descending implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        if( o1 instanceof Comparable && o2 instanceof Comparable){
            Comparable c1 = (Comparable)o1;
            Comparable c2 = (Comparable)o2;
            return c1.compareTo(c2) * -1; //change sort type in adverse
        }
        return -1;
    }
}

    // strArr=[Dog, cat, lion, tiger]
    // strArr=[cat, Dog, lion, tiger]
    // strArr=[tiger, lion, cat, Dog]