import java.util.Arrays;
import java.util.Scanner;

public class amusingJoke {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String s1 = sc.next();
        String s2 = sc.next();
        boolean b = false;

        if(s.length() + s1.length() != s2.length()){
            System.out.println("NO");
        }
        else{
            s = s.concat(s1);
            char c1[] = s.toCharArray();
            char c2[] = s2.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            for(int i = 0; i < c2.length; i++){
                if(c1[i] != c2[i]){
                    b = true;
                    break;
                }
            }

            if(b == true){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
    }
}
