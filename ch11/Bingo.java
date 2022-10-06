import java.util.*;
public class Bingo {
    public static void main(String[] args) {
        Set set = new HashSet<>();

        int[][] board = new int[5][5];

        for(int i = 0; set.size()<25; i++)
            set.add((int)(Math.random()*50)+1+"");
        Iterator it = set.iterator();

        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                board[i][j] = Integer.parseInt((String)it.next());
                System.out.print((board[i][j] < 10 ? "  " : " ") + board[i][j]);
            }
            System.out.println();
        }
    }
}
    // 45 46 48 26 27
    // 49 28 31 32 33
    // 11 34 14 15 37
    // 16 18  2  3  4
    // 7  8 41 42 21