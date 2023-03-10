import java.util.Scanner;

public class designTutorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int a  = 4;
        while(a <= n/2){
            if(isComposite(a) == true && isComposite(n - a) == true){
                System.out.println(a + " " + (n - a));
                break;
            }
            else{
                a++;
            }
        }

//        Alternate solution
//        if (n % 2 == 0) {
//            System.out.println(6 + " " + (n - 6));
//        } else {
//            System.out.println(9 + " " + (n - 9));
//        }
    }

        public static boolean isComposite(int a){
        if(a % 2 == 0){
            return true;
        }
        else{
            for(int i = 3; i <= (int)Math.sqrt(a); i++){
                if(a % i == 0){
                    return true;
                }
            }
        }
        return false;
    }
}
