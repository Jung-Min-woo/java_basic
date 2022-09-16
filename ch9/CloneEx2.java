import java.util.Arrays;

/* Covariant Return Type */
public class CloneEx2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr2 = { 1, 2, 3};
        int[] arrClone = arr.clone();
        arr2 = arr.clone();
        arrClone[0] = 6;

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrClone));
        System.out.println(Arrays.toString(arr2));
    }   
}
    // [1, 2, 3, 4, 5]
    // [6, 2, 3, 4, 5]
    // [1, 2, 3, 4, 5]