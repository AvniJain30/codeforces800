import java.util.Scanner;

public class spyDetected {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        while(t-- > 0){
            int n = s.nextInt();
            int a = s.nextInt();
            int b = s.nextInt();
            for(int i = 3; i < n; i++){
                int c = s.nextInt();
                if(a != b && a == c){
                    System.out.println(2);
                    break;
                }
                else if(a != b && b == c){
                    System.out.println(1);
                    break;
                }
                else if(a == b){
                    if(c != a){
                        System.out.println(i);
                        break;
                    }
                }
            }
        }
    }
}
