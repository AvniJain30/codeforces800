import java.util.Scanner;

public class division {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        while(n-- > 0){
            int r = s.nextInt();
            if(r >= 1900){
                System.out.println("Division 1");
            }
            else if(r >= 1600 && r <= 1899){
                System.out.println("Division 2");
            }
            else if(r >= 1400 && r <= 1599){
                System.out.println("Division 3");
            }
            else if(r <= 1399){
                System.out.println("Division 4");
            }
        }
    }
}