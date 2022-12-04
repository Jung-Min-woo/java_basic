class ThreadEx4 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        for(int i=0 ; i<300 ; i++)
            //수행시간 지연을 목적으로 new String "-" 사용한다.
            System.out.printf("%s", new String("-"));
        System.out.print("소요시간1 : " + (System.currentTimeMillis() - startTime));
        for(int i =0; i<300 ; i++)
            System.out.printf("%s", new String("|"));
        System.out.print("소요시간2 : " + (System.currentTimeMillis() - startTime));
    }    
}