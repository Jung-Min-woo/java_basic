import static java.lang.Math.*;
import static java.lang.System.*;

class mathEx1 {
    public static void main(String[] args) {
        double val = 90.7552;
        out.println("round("+ val + ")=" + round(val));
        
        val *= 100;
        out.println("round("+ val + ")=" + round(val));
        out.println("round("+ val + ")/100=" + round(val)/100);
        out.println("round("+ val + ")/100.0=" + round(val)/100.0);
        
        out.println();

        out.printf("ceil(%3.1f)=%3.1f%n", 1.1, ceil(1.1)); //Roundup
        out.printf("floor(%3.1f)=%3.1f%n", 1.1, floor(1.1)); //Rounddown
        out.printf("round(%3.1f)=%3d%n", 1.1, round(1.1)); //Round
        out.printf("round(%3.1f)=%3.1f%n", 1.5, rint(1.5)); //Round
    }    
}

    // round(90.7552)=91
    // round(9075.52)=9076
    // round(9075.52)/100=90
    // round(9075.52)/100.0=90.76

    // ceil(1.1)=2.0
    // floor(1.1)=1.0
    // round(1.1)=  1
    // round(1.5)=2.0