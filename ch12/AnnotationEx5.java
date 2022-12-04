/**
 * Annotation 규칙
 * 1) 요소의 타입은 {@code 기본형}, {@code String}, {@code enum}, {@code Annotation}, {@code Class} 만 허용된다.
 * 2) {@code Exception}  선언 불가함
 * 3) 요소를 {@code Type Variable} 설정할 수 없다.
 */
import java.lang.annotation.*;

@Deprecated
@SuppressWarnings("1111") //유효하지 않은 Annotation은 무시됨.
@TestInfo(testedBy = "aaa", testDate = @DateTime(yymmdd = "221204", hhmmss = "172100"))
class AnnotationEx5 {
    public static void main(String[] args) {
        Class<AnnotationEx5> cls = AnnotationEx5.class;

        TestInfo anno = (TestInfo)cls.getAnnotation(TestInfo.class);
        System.out.println("anno.testedBy()="+anno.testedBy());
        System.out.println("anno.tesedDate().yymmdd()=" +anno.testDate().yymmdd());
        System.out.println("anno.testedDate().hhmmss()="+anno.testDate().hhmmss());

        for(String str : anno.testTools())
            System.out.println("testTools="+str);
        System.out.println();

        Annotation[] annoArr = cls.getAnnotations();
        for(Annotation a : annoArr)
            System.out.println(a);
    }
}

/**
 * @Retention 유지정책 ** 기본 사용값은 CLASS임
 * 1) {@code SOURCE} : {@code .java} 에만 존재한다. {@code .class} 에는 존재하지 않음
 * 2) {@code CLASS} : {@code .class} 에만 존재한다. {@code .java} 에는 존재하지 않음, 실행시에 사용불가능
 * 3) {@code RUNTIME} : {@code .class} 에만 존재한다. {@code .java} 에는 존재하지 않음, 실행시에 사용가능
 */
@Retention(RetentionPolicy.RUNTIME) // 실행시에 사용가능하도록 허용한다.
@interface TestInfo{
    int count() default 1;
    String testedBy();
    String[] testTools() default "JUnit";
    TestType testType() default TestType.FINAL;
    DateTime testDate();
}

@Retention(RetentionPolicy.RUNTIME)
@interface DateTime{
    String yymmdd();
    String hhmmss();
}
enum TestType { FIRST, FINAL }

/* Result */
// anno.testedBy()=aaa
// anno.tesedDate().yymmdd()=221204
// anno.testedDate().hhmmss()=172100
// testTools=JUnit

// @java.lang.Deprecated()
// @TestInfo(count=1, testType=FINAL, testTools=[JUnit], testedBy=aaa, testDate=@DateTime(yymmdd=221204, hhmmss=172100))