class PointTest {
    public static void main(String args[]) {
        Point3D p3 = new Point3D(1, 2, 3);
        System.out.println("p3.x="+p3.x);
        System.out.println("p3.y="+p3.y);
        System.out.println("p3.z="+p3.z);
    }
}

class Point {
    int x, y;

    Point(int x, int y) {
        // Compiler inserts "super();" here automatically.
        //"super();" means "Object()" in this statement.
        this.x = x;
        this.y = y;
    }

    String getLocation() {
        return "x: " + x + ", y:" + y;
    }
}
class Point3D extends Point{
    int z;
    Point3D(int x, int y, int z){
        super(x, y);
        this.z = z;
    }
    String getLocation(){
        return "x: " + x + ", y:" + y + ", z:" +z;        
    }
}
// PointTest.java:21: error: constructor Point in class Point cannot be applied to given types;
//     Point3D(int x, int y, int z){
//                                 ^
//   required: int,int
//   found: no arguments
//   reason: actual and formal argument lists differ in length
// 1 error