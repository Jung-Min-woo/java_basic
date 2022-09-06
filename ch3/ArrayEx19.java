class ArrayEx19{
    public static void main(String[] args){
        int[][] score = {
                 {100, 100, 100}
                ,{20,   20, 20}
                ,{30,   30, 30}
                ,{40,   40, 40}
                ,{50,   50, 50}
        };
        int[] subsum = new int[3];
        int totsum =0;
        int idx = 0, jdx = 0;
        System.out.printf("No  Kor.  Eng.  Mth  Sum   Ave%n");
        for(int[] sub : score){
            System.out.printf("%2d", ++idx);
            for(int tmp : sub){
                totsum += tmp;
                subsum[jdx++] += tmp;
                System.out.printf("%5d ",tmp);
            }
            System.out.printf("%5d %5.1f%n",totsum, (float)totsum/score[jdx-1].length);
            totsum = jdx =0;
        }
        System.out.print("Sum");
        for(int temp : subsum) System.out.printf("%5d", temp);
        System.out.println();
    }
}
