import java.util.Scanner;

public class substring {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int len = s.length();

        for(int i = 0; i < len; i++){
            String temp = "";
            for(int j = i; j < len; j++){
                temp += s.charAt(j);
                System.out.println(temp);
            }
        }
    }
}
