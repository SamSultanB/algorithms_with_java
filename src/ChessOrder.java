import java.util.Scanner;

public class ChessOrder {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int[][] array = new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                array[i][j] = input.nextInt();
            }
            System.out.println();
        }
        int digit = (int) Math.pow(10,input.nextInt()-1);
        int target = input.nextInt();
        int counter = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(array[i][j] >= 10){
                    int sum = (array[i][j]%digit)+(array[i][j]/digit);
                    if(sum % target == 0){
                        counter++;
                    }
                }
            }
        }

        System.out.println(counter);

    }

}
