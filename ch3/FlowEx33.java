/* Named 'for' */
class FlowEx33 {
    public static void main(String[] args) {
        Loop1: for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (j == 5){
                    break Loop1;
                    //continue Loop1
                    //break;
                }
                System.out.println(i+"*"+j);
            }
            System.out.println("Check");
        }
    }
}