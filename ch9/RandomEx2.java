import java.util.*;

class RandomEx2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] number = new int[100];
        int[] counter = new int[10];
        
        for(int i=0; i<number.length;i++){
            //System.out.println(number[i] = (int)(Math.random()*10));
            System.out.print(number[i]=rand.nextInt(10));
        }
        System.out.println();

        for(int i=0;i<number.length;i++){
            counter[number[i]]++;
        }
        for(int i=0; i<counter.length; i++){
            System.out.println("n of " + i + " : " + printGraph('#', counter[i]) + " " + counter[i]);
        }
    }
    public static String printGraph(char ch, int value) {
        char[] bar = new char[value];

        for(int i=0;i<bar.length;i++) bar[i] = ch;
        return new String(bar);
    }
}
    // 0867826045191624667548447341287200349852327602086351831000076901093799109770265741032902712974790649
    // n of 0 : ################# 17
    // n of 1 : ######### 9
    // n of 2 : ########### 11
    // n of 3 : ####### 7
    // n of 4 : ########## 10
    // n of 5 : ##### 5
    // n of 6 : ########## 10
    // n of 7 : ############# 13
    // n of 8 : ####### 7
    // n of 9 : ########### 11