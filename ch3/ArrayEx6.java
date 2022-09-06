/*Max & Min*/
class ArrayEx6 {
    public static void main(String[] args){
        int[] score = {79, 88, 91, 33, 100, 55, 95};
        int max = score[0];
        int min = score[0];
        
        for(int temp : score){ //THINK : temp = 0 is unnecessary
            max = temp > max ? temp : max;
            min = temp < min ? temp : min;
        }
        System.out.println("Max : " +max);
        System.out.println("Min : " +min);    
    }
}