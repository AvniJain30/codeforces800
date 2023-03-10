import java.util.Arrays;
import java.util.Scanner;

public class substringLexographically {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char ch[] = s.toCharArray();
        Arrays.sort(ch);

        for(int i = 0; i < ch.length; i++){
            String temp = "";
            for(int j = i; j < ch.length; j++){
                temp += ch[j];
                System.out.println(temp);
            }
        }
    }
}
