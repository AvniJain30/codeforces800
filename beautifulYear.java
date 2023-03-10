import java.util.Scanner;

public class beautifulYear {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        n++;

        while (n < 9013) {
            int a = n % 10;
            int b = (n / 10) % 10;
            int c = (n / 100) % 10;
            int d = (n / 1000) % 10;
            if (a != b && b != c && c != d && d != a && a != c && b != d) {
                System.out.println(n);
                break;
            }
            n++;
        }
    }
}
