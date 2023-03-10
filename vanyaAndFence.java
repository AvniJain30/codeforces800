import java.util.Scanner;

public class vanyaAndFence {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int h = s.nextInt();
        int count = 0;

        while(n-- > 0){
            int num = s.nextInt();
            if(num > h){
                count += 2;
            }
            else{
                count++;
            }
        }

        System.out.println(count);
    }
}
