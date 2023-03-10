import java.util.Scanner;

public class broze {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String res = "";
        int i = 0;
        int j = s.length();
        while(i < j){
            if(s.charAt(i) == '.'){
                res += '0';
                i++;
            }
            else if(s.charAt(i) == '-' && s.charAt(i + 1) == '.'){
                res += '1';
                i+=2;
            }
            else if(s.charAt(i) == '-' && s.charAt(i + 1) == '-'){
                res += '2';
                i+=2;
            }
        }
        System.out.println(res);
    }
}
