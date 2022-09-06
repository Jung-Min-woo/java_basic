/* Bingo */
import java.util.*;
class MultiArrEx2{
    public static void main(String[] args){
        final int SIZE = 5;
        int[][] gameplate = new int[SIZE][SIZE];    //initialized
        
        // We need sampling without replacement
        // for(int i = 0; i<SIZE; i++)
        //     for(int j = 0; j<SIZE; j++)
        //         gameplate[i][j] = (int)(Math.random()*SIZE*SIZE)+1;

        for(int i = 0; i<SIZE; i++)
            for(int j = 0; j<SIZE; j++)
                gameplate[i][j] = i * SIZE + j + 1;

        MixingPlate(gameplate, 1000);
        
        while(true){
            printPlate(gameplate);
            System.out.print("Put a number between 1~"+SIZE*SIZE+"(exit:0)>");
            Scanner scanner = new Scanner(System.in);
            int inp = Integer.parseInt(scanner.nextLine());
            
            if(inp==0) break;
            if(inp<1 || inp>SIZE*SIZE){
                System.out.println("Invalid Input, try again.");
                continue;
            }
            for(int i = 0; i<SIZE; i++)
                for(int j = 0; j<SIZE; j++){
                    if(gameplate[i][j] == inp){
                        gameplate[i][j] = 0;
                        break;
                    }
                }
        }
    }
    static void MixingPlate(int[][] gameplate, int nshuffle){
        for(nshuffle = 0; nshuffle<100 ; nshuffle++){
            int x = (int)(Math.random()*gameplate.length);
            int y = (int)(Math.random()*gameplate.length);
            int temp = gameplate[0][0];
            gameplate[0][0] = gameplate[x][y];
            gameplate[x][y] = temp;
        }
    }
    static void printPlate(int[][] gameplate){
        for(int[] nn : gameplate){
            for(int n : nn)
                System.out.printf("%3d", n);
            System.out.println();
        }            
    }
}