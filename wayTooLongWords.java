import java.util.Scanner;

public class wayTooLongWords {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while(num-- > 0){
            String s = sc.next();
            int len = s.length();
            if(len > 10){
                System.out.println(s.charAt(0) + "" + (len - 2)+ "" + s.charAt(len - 1));
            }
            else{
                System.out.println(s);
            }
        }
    }
}
