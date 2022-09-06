/* Production */
class MultiArrEx3 {
    public static void main(String[] args){
        int[][] m1 = {
            {1, 2, 3},
            {4, 5, 6},
        };
        int[][] m2 = {
            {1, 2},
            {3, 4},
            {5, 6}
        };
        final int nROW = m1.length;
        final int nCOL = m2[0].length;
        final int nM2_ROW = m2.length;

        int[][] m3 = new int[nROW][nCOL];
        for(int i = 0; i<nROW; i++)
            for(int j = 0; j<nM2_ROW ; j++)
                for(int k = 0 ; k<nCOL ; k++)
                    m3[i][k] += m1[i][j] * m2[j][k];

        for(int nn[] : m3){
            for(int n : nn)
                System.out.printf("%3d",n);
            System.out.println();
        }
    }    
}
