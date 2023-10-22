import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RowOfMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int[][] array = new int[n][m];
        int max = 0;
        List<Integer> indexes = new ArrayList<Integer>();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                int in = input.nextInt();
                array[i][j] = in;
                if(in > max){
                    indexes.clear();
                    max = in;
                    indexes.add(j);
                }else if(max == in){
                    indexes.add(j);
                }
            }
        }

        for(int i = 0; i < indexes.size(); i++){
            for(int j = 0; j < n; j++){
                System.out.print(array[j][indexes.get(i)] + " ");
            }
            System.out.println();
        }


    }
}
