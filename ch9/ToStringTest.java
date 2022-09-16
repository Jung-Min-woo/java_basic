class ToStringTest {
    public static void main(String[] args) {
        String str = new String("KOREA");
        java.util.Date today = new java.util.Date();
        System.out.println(str);
        System.out.println(str.toString());
        System.out.println(Integer.toHexString(str.hashCode()));
        System.out.println(today);
        System.out.println(today.toString());
        System.out.println(Integer.toHexString(today.hashCode()));
    }
}
    // KOREA
    // KOREA
    // 446088a
    // Fri Sep 16 12:14:49 KST 2022
    // Fri Sep 16 12:14:49 KST 2022
    // 444ab311