import java.util.concurrent.*;
class ForkJoinEx1 {
    static final ForkJoinPool pool = new ForkJoinPool();
    public static void main(String[] args) {
        
    }
}
class SumTask extends RecursiveTask<Long>{
    long from, to;
    SumTask(long from, long to){
        this.from = from;
        this.to = to;
    }
    @Override
    protected Long compute() {
        // TODO Auto-generated method stub

        long size = to - from + 1;
        if(size<=5) return sum();


        return null;
    }

    long sum(){
        long tmp = 0L;
        for(long i = from ; i<=to ; i++)
            tmp += i;
        return tmp;
    }
      
}