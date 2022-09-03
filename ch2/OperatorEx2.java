class OperatorEx2 {
    public static void main(String[] args){
        int i = 5, j =0;
        j = i++;
        System.out.println("j=i++; After running, i=" + i +", j="+j);
        i=5;
        j=0;

        j=++i;
        System.out.println("j=i++; After running, i=" + i +", j="+j);

        j=i++;
        System.out.println("j=i++; After running, i=" + i +", j="+j);

        // j=i++; After running, i=6, j=5
        // j=i++; After running, i=6, j=6
        // j=i++; After running, i=7, j=6
    }
}