import java.util.Scanner;

public class fafaAndHisCompany {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = 1;
        for(int i = 2; i <= n / 2; i++){
            if((n - i) % i == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
