class StringEx3 {
    public static void main(String[] args) {
        char[] cArr = new char[0];
        String s = new String(cArr);
//      char c = '';
//'' is forbidden in JAVA
 
        System.out.println("cArr.length="+cArr.length);
        System.out.println("@@@"+s+"@@@");
    }    
}
    // cArr.length=0
    // @@@@@@