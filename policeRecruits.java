import java.util.Scanner;

public class policeRecruits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int count = 0;
        int total = 0;

        while(t-- > 0){
            int n = sc.nextInt();
            if(n > 0){
                count+=n;
            }
            else if(n == -1 && count > 0){
                count--;
            }
            else if(n == -1 && count <= 0){
                total++;
            }
        }
        System.out.println(total);

    }
}
