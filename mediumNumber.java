import java.util.Scanner;

public class mediumNumber {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        while(t-- > 0){
            int a = s.nextInt();
            int b = s.nextInt();
            int c = s.nextInt();

            if(a > b && a < c || a > c && a < b){
                System.out.println(a);
            }
            else if(b > c && b < a || b < c && b > a){
                System.out.println(b);
            }
            else{
                System.out.println(c);
            }

        }
    }
}
