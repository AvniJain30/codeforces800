import java.util.Scanner;

public class holidayOfEquality {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int i = 0, max = 0, sum = 0, count = 0;

        while(t-- > 0) {
            int n = s.nextInt();
            if(i == 0){
                max = n;
            }
            else{
                count++;
                if(max < n){
                    sum += count * (n - max);
                    max = n;
                }
                else if(max > n){
                    sum += max - n;
                }
            }
            i++;
        }
        System.out.println(sum);
    }
}
