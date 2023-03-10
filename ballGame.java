import java.util.Scanner;

public class ballGame {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int r = 1;

        for(int i = 1; i < n; i++){
            r += i;
            if(r > n){
                if(r % n != 0) {
                    System.out.print(r % n + " ");
                }
                else{
                    System.out.print(n + " ");
                }
            }
            else{
                System.out.print(r + " ");
            }
        }
    }
}
