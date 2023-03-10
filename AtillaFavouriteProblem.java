import java.util.Scanner;

public class AtillaFavouriteProblem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();           //no. of testcases
        while(num-- > 0){
            int len = sc.nextInt();
            String s = sc.next();
            int temp = 0;
            for(int i = 0; i < s.length(); i++){

                if(s.charAt(i) - 96 > temp){
                    temp = s.charAt(i) - 96;
                }
            }
            System.out.println(temp);
        }
    }
}
