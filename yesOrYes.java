import java.util.Scanner;

public class yesOrYes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();             //no. of testcases
        while(num-- > 0){
            String s = sc.next().toLowerCase();
            if(s.equals("yes")){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
