@FunctionalInterface
interface MyFunction {
    void method();
}
class LambdaEx2 {
    public static void main(String[] args) {
        MyFunction f = () -> {}; // MyFunction f = (MyfFunction)( () -> {} );
        Object obj = (MyFunction)( () -> {} );
        String str =  ((Object)(MyFunction)( () -> {} )).toString();

        System.out.println(f);
        System.out.println(obj);
        System.out.println(str);

        // !!Error Lambda식은 Object Type으로 형변환이 불가하다.
        // System.out.println(() -> {});
        System.out.println((MyFunction)( () -> {} ));
        System.out.println( ((Object)(MyFunction)( () -> {} )).toString());

    }   
}
// LambdaEx2$$Lambda$1/1283928880@404b9385
// LambdaEx2$$Lambda$2/1324119927@6d311334
// LambdaEx2$$Lambda$3/990368553@41629346
// LambdaEx2$$Lambda$4/1747585824@3d075dc0
// LambdaEx2$$Lambda$5/558638686@448139f0