import java.util.Scanner;

public class wrongSubtraction {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();

        while(k-- > 0){
            int temp = n % 10;
            if(temp != 0){
                n--;
            }
            else{
                n /= 10;
            }
        }
        System.out.println(n);
    }
}
