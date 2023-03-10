import java.util.Scanner;

public class inGameChat {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        while(t-- > 0){
            int n = s.nextInt();
            String sc = s.next();
            int ans = 0;
            for (int i = n - 1; i >= 0; i--) {
                if (sc.charAt(i) == ')') {
                    ans++;
                }
                else{
                    break;
                }
            }

            if (ans <= n - ans) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }
    }
}
