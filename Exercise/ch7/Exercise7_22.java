abstract class Shape{
    Point p;
    Shape(){
        this(new Point(0,0));
    }
    Shape(Point p){
        this.p = p;
    }
    abstract double calcArea();
    Point getPosition(){
        return p;
    }
    void setPosition(){
        this.p = p;
    }
}
class Circle extends Shape{
    double r;
    Circle(){ 
        this(new Point(0,0), 0);
    }
    Circle(double r){
        this(new Point(0,0), r);
    }
    Circle(Point p, double r){
        super(p);
        this.r = r;
    }
    @Override
    double calcArea() {
        return r*r*Math.PI;
    }
}
class Rectangle extends Shape{
    double width, height;
    Rectangle() { 
        this(new Point(0,0), 0.0, 0.0);
    }
    Rectangle(double width, double height){
        this(new Point(0,0), width, height);
    }
    Rectangle(Point p, double width, double height){
        super(p);
        this.width = width;
        this.height = height;
    }
    boolean isSquare(){
        return (width == height ? true : false);
    }
    @Override
    double calcArea() {
        return width * height;
    }

}
class Exercise7_22 {
    /*
     * (1) sumArea 
     */
    public static double sumArea(Shape[] s){
        double sum = 0.0;
        for(Shape elem : s) sum += elem.calcArea();
        return sum;
    }
    public static void main(String[] args) {
        Shape[] arr = {new Circle(5.0), new Rectangle(3,4), new Circle(1.0)};
        System.out.println("Sum of Area : " + sumArea(arr));
    }
}
class Point{
    int x,y;
    Point(){ this(0,0); }
    Point(int x, int y){
        this.x =x;
        this.y =y;
    }
    @Override
    public String toString() {
        return "["+x+","+y+"]";
    }
}
// Sum of Area : 93.68140899333463