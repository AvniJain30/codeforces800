import java.util.Scanner;

public class findTheArray {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        while(t-- > 0){
            int a = s.nextInt();
            int sum = 0;
            int count = 0;
            int x = 1;
            while(sum < a){
                sum += x;
                x += 2;
                count++;
            }
            System.out.println(count);
        }
    }
}
