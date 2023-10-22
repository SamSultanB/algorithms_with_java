import java.util.Scanner;

public class DiagonalMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[][] array = new int[size][size];
        int diagonal = size;
        for(int i = 0; i < size; i++){
            diagonal--;
            for(int j = 0; j < size; j++){
                if(j < diagonal){
                    System.out.print(0 + " ");
                }else if(j == diagonal){
                    System.out.print(1 + " ");
                }else if(j > diagonal){
                    System.out.print(2 + " ");
                }
            }
            System.out.println();
        }

    }

}
