class CastingTest2 {
    public static void main(String[] args){
        Car car = new Car();
        Car car2 = null;
        FireEngine fe = null;
        
        car.drive();
        fe= (FireEngine)car;    // Down-casting
                                // Compile is possible, but error occurs when it runs.
                                // Exception in thread "main" java.lang.ClassCastException: Car cannot be cast to FireEngine
                                // at CastingTest2.main(CastingTest2.java:8)         
                                // ** it makes a problem because variable 'car' refers an 'Car type' instance
                                // ** I can fix it with changing #3 to "Car car = new FireEnging();"
        fe.drive();
        car2 = fe;
        car2.drive();
    }
}
/* 
 * 서로 상속관계에 있는 클래스 타입의 참조변수간 형변환은 양방향 가능!
 * 참조변수가 참조하는 인스턴스의 자손타입으로 형변환하는 것은 불가
 * 따라서 참조변수가 가리키는 인스턴스 타입을 확인하는 거이 중요
 */