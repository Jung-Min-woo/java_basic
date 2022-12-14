import java.util.*;
class ArrayEx {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4};
        int[][] arr2D = {{11,12,13}, {21,22,23}};

        System.out.println("arr="+Arrays.toString(arr));
        System.out.println("arr2D="+Arrays.toString(arr2D));

        int[] arr2 = Arrays.copyOf(arr, arr.length);
        int[] arr3 = Arrays.copyOf(arr, 3);
        int[] arr4 = Arrays.copyOf(arr, 7);
        int[] arr5 = Arrays.copyOfRange(arr, 2, 4);
        int[] arr6 = Arrays.copyOfRange(arr, 0, 7);

        System.out.println("arr2="+Arrays.toString(arr2));
        System.out.println("arr3="+Arrays.toString(arr3));
        System.out.println("arr4="+Arrays.toString(arr4));
        System.out.println("arr5="+Arrays.toString(arr5));
        System.out.println("arr6="+Arrays.toString(arr6));
        
        int[] arr7 = new int[5];
        Arrays.fill(arr7, 9);
        System.out.println("arr7="+Arrays.toString(arr7));
        
        Arrays.setAll(arr7, i -> (int)(Math.random()*6)+1);
        System.out.println("arr7="+Arrays.toString(arr7));

        for(int i : arr7){
            char[] graph = new char[i];
            Arrays.fill(graph, '*');
            System.out.println(new String(graph) + i);   
        }

        String[][] str2D = new String[][]{{"aaa,bbb"}, {"AAA","BBB"}};
        String[][] str2D2 = new String[][]{{"aaa,bbb"}, {"AAA","BBB"}};

        System.out.println(Arrays.equals(str2D, str2D2));       //false
        System.out.println(Arrays.deepEquals(str2D, str2D2));   //true

        char[] chrArr = {'A','D','C','B','E'};
        System.out.println("chArr="+Arrays.toString(chrArr));
        System.out.println("Index of B ="+Arrays.binarySearch(chrArr, 'B'));
        System.out.println("== After Sorting ==");
        Arrays.sort(chrArr);
        System.out.println("chArr = "+Arrays.toString(chrArr));
        System.out.println("Index of B = " + Arrays.binarySearch(chrArr, 'B'));
    }
}
    // arr=[0, 1, 2, 3, 4]
    // arr2D=[[I@4aa298b7, [I@7d4991ad]
    // arr2=[0, 1, 2, 3, 4]
    // arr3=[0, 1, 2]
    // arr4=[0, 1, 2, 3, 4, 0, 0]
    // arr5=[2, 3]
    // arr6=[0, 1, 2, 3, 4, 0, 0]
    // arr7=[9, 9, 9, 9, 9]
    // arr7=[1, 6, 2, 1, 2]
    // *1
    // ******6
    // **2
    // *1
    // **2
    // false
    // true
    // chArr=[A, D, C, B, E]
    // Index of B =-2       <-- undesired result (unsorted)
    // == After Sorting ==
    // chArr = [A, B, C, D, E]
    // Index of B = 1