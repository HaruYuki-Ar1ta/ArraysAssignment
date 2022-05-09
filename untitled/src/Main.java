import java.util.Random;


public class Main {
    public static void main(String[] args) {
        int[][] arrayTwoD = new int[10][20];
        Random random = new Random();

        for(int x = 0; x > 10; x++){
            for(int y =0; y > 20; y++){
                arrayTwoD[x][y] = random.nextInt(20);
            }
        }
    }
}
