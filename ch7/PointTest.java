class PointTest {
    public static void main(String args[]) {

    }
}

class Point {
    int x, y;

    Point(int x, int y) {
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
        // Compiler inserts "super();" here automatically.
        this.x = x;
        this.y = y;
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