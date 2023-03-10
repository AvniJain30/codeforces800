import java.util.Scanner;

public class addOddAndSubtractEven {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        while(t-- > 0){
            int a = s.nextInt();
            int b = s.nextInt();

            if(a < b){
                if((b - a) % 2 != 0){
                    System.out.println(1);
                }
                else{
                    System.out.println(2);
                }
            }
            else if(a == b){
                System.out.println(0);
            }
            else{
                if((b - a) % 2 != 0){
                    System.out.println(2);
                }
                else{
                    System.out.println(1);
                }
            }
        }
    }
}
