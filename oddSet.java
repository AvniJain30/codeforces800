import java.util.Scanner;

public class oddSet {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        while(t-- > 0){
            int n = s.nextInt();
            int count = 0;
            int arr[] = new int[2 * n];
            for(int i = 0; i < 2 * n; i++){
                arr[i] = s.nextInt();
                if(arr[i] % 2 == 0){
                    count++;
                }
            }
            if(count == n){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
