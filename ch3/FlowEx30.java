class FlowEx30 {
    public static void main(String[] args){
        int sum = 0;
        int i = 0;
        while(true){
            if(sum>100) break;
            sum += ++i; //It is samee as the statement "++i; sum+=i;"
        }
        System.out.println("i="+i);
        System.out.println("sum="+sum);
    }    
    //i=14
    //sum=105
}
