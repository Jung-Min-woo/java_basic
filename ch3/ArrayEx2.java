import java.util.*;
class ArrayEx2 {
    public static void main(String[] args){
        int[] iArr1 = new int[10];
        int[] iArr2 = new int[20];
        int[] iArr3 = new int[]{100,95,80,70,60};
        int[] iArr4 = {100, 95, 80, 70, 70};
        char[] chArr = {'a', 'b', 'c', 'd'};
        char[] test;

        /* Declaration and Initialization of Array
         *** Possible term of use ***
         * int[] arr;
         * arr = new int[]{50,60,70, ...};
         *** Impossible term of use ***
         * int[] arr;
         * arr = {50, 60, 70, ...}; // must be used with "new int[]"
         * "new int" is only omittable when it is declared and initialized at the same time.
         */

        for(int i =0 ; i<iArr1.length;i++)
            iArr1[i] = i+1;
        for(int i =0; i<iArr2.length; i++)
            iArr2[i] = (int)(Math.random()*10) + 1;
        for(int i=0; i<iArr1.length;i++)
            System.out.print(iArr1[i]+",");
        System.out.println();
        System.out.println(Arrays.toString(iArr2));
        System.out.println(Arrays.toString(iArr3));
        System.out.println(Arrays.toString(chArr));
        System.out.println(iArr4);
        System.out.println(chArr);
        //System.out.println(test); Error, test is not initialized
    }
        // 1,2,3,4,5,6,7,8,9,10,
        // [7, 3, 7, 1, 4, 2, 1, 3, 2, 5, 5, 7, 10, 8, 2, 6, 4, 7, 7, 8]
        // [100, 95, 80, 70, 60]
        // [a, b, c, d]
        // [I@7d4991ad //1D int array @ address
        // abcd
}