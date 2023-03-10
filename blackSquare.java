import java.util.Scanner;

public class blackSquare {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int sum = 0;

        String s = sc.next();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '1'){
                sum += a;
            }
            else if(s.charAt(i) == '2'){
                sum += b;
            }
            else if(s.charAt(i) == '3'){
                sum += c;
            }
            else{
                sum += d;
            }
        }

        System.out.println(sum);

    }
}
