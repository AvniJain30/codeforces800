import java.util.Scanner;

public class freeIceCream {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        long t = s.nextInt();
        long n = s.nextInt();
        long count = 0;

        while(t-- > 0){
            char c = s.next().charAt(0);
            long a = s.nextLong();
            if(c == '-'){
                if(n - a < 0){
                    count++;
                }
                else {
                    n = n - a;
                }
            }
            else{
                n = a + n;
            }
        }
        System.out.println(n + " " + count);
    }
}
