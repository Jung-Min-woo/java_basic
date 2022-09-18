import java.util.StringJoiner;

class StringEx4 {
    public static void main(String[] args) {
        String animals = "dog,cat,bear";
        String[] arr = animals.split(",");
        System.out.println(String.join("-", arr));

        StringJoiner sj = new StringJoiner(",", "[", "]");
        String[] strArr = {"aaa", "bbb", "ccc"};

        for(String s : strArr) sj.add(s.toUpperCase());
        System.out.println(sj.toString());
    }    
}
    // dog-cat-bear
    // [AAA,BBB,CCC]