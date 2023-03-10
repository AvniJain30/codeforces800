import java.util.Scanner;

public class calculatingFunctions {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
//        //int sum = 0;
//
////        for(int i = 1; i <= n; i++){
////            if(i % 2 == 0){
////                sum += i;
////            }
////            else{
////                sum -= i;
////            }
////        }
//
        if(n % 2 == 0){
            System.out.println(n / 2);
        }
        else{
            System.out.println((-1)*((n / 2) + 1));
        }
//
//
//        //System.out.println(sum);
    }
}
