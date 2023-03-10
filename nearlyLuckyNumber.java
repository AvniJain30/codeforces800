import java.util.Scanner;

public class nearlyLuckyNumber {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        int count = 0;

        while(n > 0){
            long temp = n % 10;
            if(temp == 7 || temp == 4){
                count++;
            }
            n = n / 10;
        }

        if(count == 4 || count == 7){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
