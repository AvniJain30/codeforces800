import java.util.Scanner;

public class word {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int uC = 0, lC = 0;
        for(int i = 0; i < s.length(); i++){
            if(97 <= s.charAt(i) && s.charAt(i) <= 125){
                lC++;
            }
            else{
                uC++;
            }
        }

        if(lC >= uC){
            System.out.println(s.toLowerCase());
        }
        else{
            System.out.println(s.toUpperCase());
        }
    }
}
