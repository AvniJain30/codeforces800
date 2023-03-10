import java.util.Scanner;

public class linearKeyboard {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        while(t-- > 0){
            String s1 = s.next();
            String s2 = s.next();
            int n = s2.length();
            int sum = 0;
            for(int i = n - 1; i > 0; i--){
                sum += Math.abs(s1.indexOf(s2.charAt(i)) - s1.indexOf(s2.charAt(i - 1)));
            }

            System.out.println(sum);
        }
    }
}
