// Annotation
/**
 * @SuppressWarnings("unchecked") : Generics로 타입을 지정하지 않은 경우 발생하는 경고 무시
 * @SuppressWarnings("rawtypes") : Generics를 사용하지 않아서 발생하는 경고를 무시
 * @SuppressWarnings("deprecation") : @Deprecated 붙은 것을 무시
 * @SuppressWarnings("varargs") : 가변인자 타입이 Generics인 경우
 * 
 * reifiable : 컴파일 이후에 제거되지 않는 타입
 * non-reifiable : 컴파일 이후에 제거되는 타입
 */
import java.util.ArrayList;
class NewClass{
    int newField;
    int getNewField(){
        return newField;
    }
    @Deprecated
    int oldField;
    @Deprecated
    int getOldField(){
        return oldField;
    }
}
class AnnotationEx3 {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        NewClass nc = new NewClass();

        nc.oldField = 10;
        System.out.println(nc.getOldField());

        @SuppressWarnings("unchecked")
        ArrayList<NewClass> list = new ArrayList();
        list.add(nc);
    }    
}
