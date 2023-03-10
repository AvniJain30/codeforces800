import java.util.Scanner;

public class magnets {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int count = 1;

        int n = s.nextInt();
        int temp = n;
        for(int i = 2; i <= t; i++){
            int current = s.nextInt();
            if(current != temp){
                count++;
            }
            temp = current;
        }

        System.out.println(count);
    }
}
