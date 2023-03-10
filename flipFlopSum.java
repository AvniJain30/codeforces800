import java.util.Scanner;

public class flipFlopSum {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        while(t-- > 0){
            int n = s.nextInt();
            int arr[] = new int[n];
            int sum = 0;
            int count = 0;
            for(int i = 0; i < n; i++){
                arr[i] = s.nextInt();
                sum += arr[i];
                if(arr[i] == -1){
                    count++;
                }
            }
            int countNeg = 0;
            for(int i = 0; i < n - 1; i++){
                if(arr[i] == -1 && arr[i + 1] == -1){
                    countNeg++;
                    sum += 4;
                    break;
                }
            }
            if(countNeg == 1){
                System.out.println(sum);
            }
            else{
                if(count > 0){
                    System.out.println(sum);
                }
                else{
                    System.out.println(sum - 4);
                }
            }
        }
    }
}
