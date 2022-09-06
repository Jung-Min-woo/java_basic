class ArrayEx5 {
    public static void main(String[] args){
        int sum = 0;
        float average = 0.f; 
        int[] score = {100, 88, 100, 100, 90};

        //for(int i =0; i<score.length; i++ ) sum+=score[i];
        for(int temp : score) sum+=temp;
        average=(float)sum/score.length;

        System.out.println("Sum : "+sum);
        System.out.println("Average : "+average);
    }
}
