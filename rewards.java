import java.util.Scanner;

public class rewards {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int c1 = s.nextInt();
        int c2 = s.nextInt();
        int c3 = s.nextInt();
        int m1 = s.nextInt();
        int m2 = s.nextInt();
        int m3 = s.nextInt();
        int sh = s.nextInt();

        int cSum = 0;
        cSum = c1 + c2 + c3;
        int mSum = m1 + m2 + m3;
        if(cSum + mSum < sh){
            System.out.println("YES");
        }
        else {
            if (cSum % 5 == 0) {
                sh -= (cSum / 5);
            } else {
                sh -= (cSum / 5) + 1;
            }


            if (mSum % 10 == 0) {
                sh -= (mSum / 10);
            } else {
                sh -= (mSum / 10) + 1;
            }

            if (sh >= 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
