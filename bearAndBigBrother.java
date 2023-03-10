import java.util.Scanner;

public class bearAndBigBrother {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();          //weight of bob
        int b = sc.nextInt();          //weight of brother
        int count = 0;

        while(a <= b){
            a *= 3;
            b *= 2;
            count++;
        }

        System.out.println(count);
    }
}
