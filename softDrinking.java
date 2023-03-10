import java.util.Scanner;

public class softDrinking {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int l = s.nextInt();
        int c = s.nextInt();
        int d = s.nextInt();
        int p = s.nextInt();
        int nl = s.nextInt();
        int np = s.nextInt();

        int n1, n2, n3, mini;
        n1 = (k * l) / nl;
        n2 = c * d;
        n3 = p / np;
        mini = Math.min(n1, n2);
        System.out.println(Math.min(mini, n3) / n);

    }
}
