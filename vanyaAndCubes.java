import java.util.Scanner;

public class vanyaAndCubes {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0, count = 0;

        while(sum < n){
            count++;
            for(int i = 1; i <= count; i++){
                sum += i;
            }

            if((sum + ((count + 1)*(count +2) / 2) ) > n){
                break;
            }
        }

        System.out.println(count);
    }
}
