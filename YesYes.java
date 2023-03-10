import java.util.Scanner;

public class YesYes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        while (num-- > 0) {
            String s = sc.next();
            String sum = "";

            for(int i = 0; i < 20; i++){
                sum += "Yes";
            }

            if(sum.contains(s)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
