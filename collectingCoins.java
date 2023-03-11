import java.util.Scanner;

public class collectingCoins {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        while(t-- > 0){
            int a = s.nextInt();
            int b = s.nextInt();
            int c = s.nextInt();
            int n = s.nextInt();
            int A, B, C;
            //a + A = b + B = c + C
            //A + B + C = n

            int max = Math.max(a,Math.max(b, c));
                if (a == max) {
                    n = n - (max - b + max - c);
                } else if (b == max) {
                    n = n - (max - a + max - c);
                } else {
                    n = n - (max - b + max - a);
                }

                if (n % 3 == 0 && n >= 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }

        }
    }
}

