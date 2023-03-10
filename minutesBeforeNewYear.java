import java.util.Scanner;

public class minutesBeforeNewYear {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        while(n-- > 0){
            int h = s.nextInt();
            int m = s.nextInt();

            int minute = 60 - m;
            int sum = (24 - (h + 1)) * 60;
            System.out.println(sum + minute);
        }
    }
}
