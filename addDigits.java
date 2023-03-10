import java.util.Scanner;

public class addDigits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        System.out.println(add(num));

    }

    public static int add(int num){
        int sum = 0;

        if(num <= 9){
            return num;
        }
        while (num > 0) {
            int temp = num % 10;
            sum += temp;
            num /= 10;
        }

        return add(sum);
    }
}
