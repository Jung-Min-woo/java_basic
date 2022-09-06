class ArrayEx8 {
    public static void main(String[] args){
        int[] ball = new int[45];
        for(int i = 0 ; i < ball.length; i++) ball[i] = i+1;

        for(int i = 0 ; i<6; i++){
            int n = (int)(Math.random()*45);
            int temp = ball[i];
            ball[i] = ball[n];
            ball[n] = temp;
        }
        for(int i = 0 ; i<6 ; i++) System.out.printf("ball[%d] = %d%n", i, ball[i]);
    }    
}
