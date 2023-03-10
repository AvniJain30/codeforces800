import java.util.Scanner;

public class inSearchOfEasyProblem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean b = false;

        while(n-- > 0){
            int num = sc.nextInt();
            if(num == 1){
                b = true;
                break;
            }
            else{
                b = false;
            }
        }

        if(b == true){
            System.out.println("HARD");
        }
        else{
            System.out.println("EASY");
        }
    }
}
