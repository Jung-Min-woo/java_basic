class NewClass{
    int newField;
    int getNewField() {return newField;}

    @Deprecated
    int oldField;

    @Deprecated
    int getOldField() {return oldField;}
}
class AnnotationEx2 {
    public static void main(String[] args) {
        NewClass nc = new NewClass();
        nc.oldField = 10;
        System.out.println(nc.getOldField());
    }
}
// 컴파일 결과 //
// Note: AnnotationEx2.java uses or overrides a deprecated API.
// Note: Recompile with -Xlint:deprecation for details.

//-Xlint 컴파일 결과
// AnnotationEx2.java:14: warning: [deprecation] oldField in NewClass has been deprecated
//         nc.oldField = 10;
//           ^
// AnnotationEx2.java:15: warning: [deprecation] getOldField() in NewClass has been deprecated
//         System.out.println(nc.getOldField());
//                              ^
// 2 warnings