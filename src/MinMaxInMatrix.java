import java.util.Scanner;

public class MinMaxInMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();

        int min = 1000001;
        int minN = 0;
        int minM = 0;
        int max = 0;
        int maxN = 0;
        int maxM = 0;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                int s = input.nextInt();
                if(min > s){
                    min = s;
                    minN = i;
                    minM = j;
                };
                if(max < s){
                    max = s;
                    maxN = i;
                    maxM = j;
                }
            }
        }
        System.out.println(minN + " " + minM + " " + min);
        System.out.println(maxN + " " + maxM + " " + max);

    }
}
