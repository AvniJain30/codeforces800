import java.util.Scanner;

public class translation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        if(s.length() != t.length()){
            System.out.println("NO");
        }
        else {
            boolean b = false;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == t.charAt((s.length() - 1) - i)) {
                    b = true;
                } else {
                    b = false;
                    break;
                }
            }

            if(b == true){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
