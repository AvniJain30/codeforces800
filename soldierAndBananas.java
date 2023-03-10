import java.util.Scanner;

public class soldierAndBananas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();
        int sum = 0;

        while(w > 0){
            int total = k * w;
            sum += total;
            w--;
        }

        if(sum <= n){
            System.out.println(0);
        }
        else{
            System.out.println(sum - n);
        }
    }
}
