class StringEx7 {
    public static void main(String[] args) {
        String fullName = "Hello.java";

        int index = fullName.indexOf('.');
        String fileName = fullName.substring(0, index);
        // Same as fullName.substring(index+1, fullName.length());
        String ext = fullName.substring(index+1);

        System.out.println(fullName + "'s name without extemsion is " + fileName);
        System.out.println(fullName + "'s extemsion is " + ext);
    }    
}
    // Hello.java's name without extemsion is Hello
    // Hello.java's extemsion is java