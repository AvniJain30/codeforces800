import java.util.Scanner;

public class presents {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int arr[] = new int[t+1];

        for(int i = 0; i < t; i++){
            arr[i] = s.nextInt();
//            int temp = s.nextInt();
//            arr[temp]=i;
        }

        for(int i = 1; i <= t; i++){
           arr[arr[i - 1] - 1] = i;
           System.out.print(arr[i - 1] + " ");
//            System.out.print(arr[i]+" ");
        }
    }
}
