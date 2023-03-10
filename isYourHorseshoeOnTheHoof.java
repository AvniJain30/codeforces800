import java.util.Scanner;
import java.util.Arrays;

public class isYourHorseshoeOnTheHoof {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int arr[] = new int[4];
        int count = 1;

        for(int i = 0; i < 4; i++){
            arr[i] = s.nextInt();
        }

        Arrays.sort(arr);
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] != arr[i + 1]){
                count++;
            }
        }

        System.out.println(4 - count);
    }
}
