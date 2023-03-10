import java.util.Scanner;

public class wordCapitalization {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c[] = s.toCharArray();
        c[0] = Character.toUpperCase(c[0]);
        for(int i = 0; i < c.length; i++){
            System.out.print(c[i]);
        }
    }
}
