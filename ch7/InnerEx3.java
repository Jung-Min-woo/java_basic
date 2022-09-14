class InnerEx3 {
    private int outerIv = 0;
    static int outerCv = 0;
    
    class instanceInner{
        int iiv = outerIv; //It can get access to private member of outer class.
        int iiv2 = outerCv;
    }
    static class StaticInner{
        //static class cannot access to instance member;
//      int siv = outerIv;
        static int scv = outerCv;
    }
    void MyMethod(){
        int lv = 0;
        //From JDK1.8, final is omittable.
        final int LV = 0;

        class LocalInner{
            int liv = outerIv;
            int liv2 = outerCv;
            int liv3 = lv;  //Before JDK1.8, outer class could only access to final variables
                            //But now from JDK1.8, it doesn't matter. 
            int liv4 = LV;
        }
    }
}
