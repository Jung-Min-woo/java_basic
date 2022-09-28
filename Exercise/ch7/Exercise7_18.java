class Exercise7_18 {
    public static void main(String[] args) {
        Robot[] arr = {new DanceRobot(), new SingRobot(), new DrawRobot()};
        for(int i=0; i<arr.length; i++) action(arr[i]);
    }    
    static void action(Robot x){
        if(x instanceof DanceRobot) ((DanceRobot)x).dance();
        else if(x instanceof SingRobot) ((SingRobot)x).sing();
        else if(x instanceof DrawRobot) ((DrawRobot)x).draw();
        else return;
    }
}
class Robot{
}
class DanceRobot extends Robot{
    void dance(){
        System.out.println("Dance");
    }
}
class SingRobot extends Robot{
    void sing(){
        System.out.println("Sing");
    }
}
class DrawRobot extends Robot{
    void draw(){
        System.out.println("Draw");
    }
}
