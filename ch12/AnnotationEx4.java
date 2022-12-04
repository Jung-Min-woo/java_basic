/**
 * @SuppressWarnings("unchecked") : Generics로 타입을 지정하지 않은 경우 발생하는 경고 무시
 * @SuppressWarnings("rawtypes") : Generics를 사용하지 않아서 발생하는 경고를 무시
 * @SuppressWarnings("varargs") : 가변인자 타입이 Generics인 경우
 * @SuppressWarnings("deprecation") : @Deprecated 붙은 것을 무시
 * 
 * reifiable : 컴파일 이후에 제거되지 않는 타입
 * non-reifiable : 컴파일 이후에 제거되는 타입
 */

import java.util.Arrays;

class MyArrayList<T>{
    T[] arr;
    
    /** 
     * @SafeVarargs : 이 메서드의 가변인자는 타입안정성(Type-safe)이 있음을 나타낸다. 
     * 메시드가 호출된 영역까지 컴파일 경고를 억제한다.
     * {@code unchecked} 경고는 억제가 가능하나  {@code varargs} 경고는 억제할 수 없음
    */
    //@SafeVarargs
    //@SuppressWarnings("varargs")
    MyArrayList(T... arr){
        this.arr = arr;
    }
    //@SafeVarargs
    //@SuppressWarnings("unchecked")
    public static <T> MyArrayList<T> asList(T... a){
        return new MyArrayList<>(a);
    }
    public String toString(){
        return Arrays.toString(arr);
    }
}
class AnnotationEx4{
    //@SuppressWarnings("unchecked")
    public static void main(String[] args) {
        MyArrayList<String> list = MyArrayList.asList("1", "2", "3");
        System.out.println(list);
    }
}

/* @SafeVargs 생략 */
// Note: AnnotationEx4.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.
// ------Xlint-------
// AnnotationEx4.java:23: warning: [unchecked] Possible heap pollution from parameterized vararg type T
//     MyArrayList(T... arr){
//                      ^
//   where T is a type-variable:
//     T extends Object declared in class MyArrayList
// AnnotationEx4.java:28: warning: [unchecked] Possible heap pollution from parameterized vararg type T
//     public static <T> MyArrayList<T> asList(T... a){
//                                                  ^
//   where T is a type-variable:
//     T extends Object declared in method <T>asList(T...)
// 2 warnings