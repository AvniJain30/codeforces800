import java.util.Scanner;

public class bit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int X = 0;

        while(n-- > 0){
            String s = sc.next();
            if(s.equals("++X") || s.equals("X++")){
                X++;
            }
            else{
                X--;
            }
        }

        System.out.println(X);
    }
}
