/*Sort */
import java.util.*;
class ArrayEx10 {
    public static void main(String[] args){
        int[] numArr = new int[10];
        int nc = 0;
        int nc_average = 0;
        final int MAX_ITER = 10000;
        for(int iter = 0; iter <MAX_ITER ; iter++ ){
            for(int i = 0 ; i<numArr.length; i++) numArr[i] = (int)(Math.random()*numArr.length) +1;
            for(int i = 0 ; i<numArr.length; i++) 
                for(int j = i+1; j<numArr.length; j++)
                    if(numArr[i] > numArr[j]){
                        int temp = numArr[i];
                        numArr[i] = numArr[j];
                        numArr[j] = temp;
                        nc++;
                    }           
                    nc_average += nc;
                    nc = 0;
                }
                System.out.println("nAverage_Changed : " + (float)nc_average/MAX_ITER);
     }
     //aver : 15.777
}