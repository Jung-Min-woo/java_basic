class OperatorEx16 {
    public static void main(String[] args){
        float pi = 3.141592f;
        float shortpi = (int)(pi*100) / 1000f;  //0.314
        float test = (int)(pi*100) / 1000;      //0.0
        System.out.println(shortpi);
        System.out.println(test);
    }
}