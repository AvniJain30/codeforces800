import java.util.Scanner;

public class brokenKeyboard {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        boolean b = false;

        while(t-- > 0){
            int n = s.nextInt();
            String sc = s.next();

            if(n == 2){
                System.out.println("NO");
            }
            else if(n == 1){
                System.out.println("YES");
            }
            else{
                for(int i = 1; i < n - 1; i += 3){
                    if(sc.charAt(i) != sc.charAt(i + 1)){
                        b = false;
                        System.out.println("NO");
                        break;
                    }
                    else{
                        b = true;
                    }
                }

                if(b == true){
                    System.out.println("YES");
                }
            }
        }
    }
}
