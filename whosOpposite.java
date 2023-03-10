import java.util.Scanner;

public class whosOpposite {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        while(t-- > 0){
            int a = s.nextInt();
            int b = s.nextInt();
            int c = s.nextInt();

            int d = 2 * Math.abs(b - a);

            if(a > d || b > d || c > d){
                System.out.println(-1);
            }
            else{
                int n = d / 2 + c;
                while(n > d){
                    n -= d;
                }
                System.out.println(n);
            }
        }
    }
}
