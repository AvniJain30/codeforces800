import java.util.Scanner;

public class newYearAndHurry {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int sum = 0, n = 0;
        boolean f = false;

        for(int i = 1; i <= a; i++){
            sum += 5 * i;
            if(1200 + b + sum > 1440){
                n = i - 1;
                f = true;
                break;
            }
        }

        if(f == true){
            System.out.println(n);
        }
        else{
            System.out.println(a);
        }
    }
}
