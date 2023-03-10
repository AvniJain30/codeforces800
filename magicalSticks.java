import java.util.Scanner;

public class magicalSticks {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        while(t-- > 0){
            int n = s.nextInt();

            if(n == 1 || n == 2){
                System.out.println(1);
            }
            else {
                if (n % 2 == 0) {
                    System.out.println(n / 2);
                } else {
                    System.out.println((n / 2) + 1);
                }
            }
        }
    }
}
