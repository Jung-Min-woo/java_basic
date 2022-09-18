class StringExtest {
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = new String("abc");
        String s3 = s1.intern();
        System.out.println(s1 == s2); // false
        System.out.println(s1==s3); //false
        System.out.println(s1 =="abc"); //false
        System.out.println(s3 == "abc"); //true
        System.out.println(s1);
        System.out.println(s1.intern());
        System.out.println(s3);
    }    
}