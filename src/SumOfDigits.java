import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int[][] array = new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                array[i][j] = input.nextInt();
            }
        }
        int digit = input.nextInt();
        int target = input.nextInt();
        int counter = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(String.valueOf(array[i][j]).length() == digit){
                    int check = 0;
                    int num = array[i][j];
                    int k = digit;
                    while(k != 0){
                        check += num%10;
                        num/=10;
                        k-=1;
                    }
                    if(check%target==0){
                        counter++;
                    }
                }
            }
        }

        System.out.println(counter);

    }

}
