import java.util.Scanner;

public class candiesAnd2Sisters {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        while(n-- > 0){
            int c = s.nextInt();
            if(c <= 2){
                System.out.println(0);
            }
            else if(c % 2 == 0) {
                System.out.println((c / 2) - 1);
            }
            else{
                System.out.println(c / 2);
            }
        }
    }
}

