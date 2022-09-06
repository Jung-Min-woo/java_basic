/*Bubble Sort */
import java.util.*;
class ArrayEx10_ans {
    public static void main(String[] args){
        int[] numArr = new int[10];
        int nc = 0;
        final int MAX_ITER = 10000;
        int nc_average = 0;
        for(int iter = 0; iter <MAX_ITER ; iter++ ){
            for(int i = 0 ; i<numArr.length; i++) numArr[i] = (int)(Math.random()*numArr.length) +1;
            
            //Bubble Sort
            for(int i = 0; i<numArr.length-1; i++){
                Boolean changed = false;
                for(int j = 0; j<numArr.length-1-i; j++){
                    if(numArr[j] > numArr[j+1]){
                        int temp = numArr[j];
                        numArr[j] = numArr[j+1];
                        numArr[j+1] =temp;
                        changed = true;
                        nc++;
                    }
                }
               if(!changed) break;
            }
            nc_average += nc;
            nc = 0;
        }
        System.out.println("nAverage_Changed : " + (float)nc_average/MAX_ITER);
     }
     //aver 20.178
}