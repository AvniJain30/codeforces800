import java.util.Scanner;

public class extremelyRound {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        while(t-- > 0){
            int n = s.nextInt();
            if(n >= 1 && n <= 10){
                System.out.println(n);
            }
            else if(n > 10 && n <= 100){
                System.out.println(9 + n / 10);
            }
            else if(n > 100 && n / 100 == 0 && n <= 1000){
                System.out.println(n / 10);
            }
            else if(n > 1000 && n / 1000 == 0 && n <= 10000){
                System.out.println(n / 100);
            }
            else if(n > 10000 && n / 10000 == 0 && n <= 100000){
                System.out.println(n / 1000);
            }
            else if(n > 100000 && n / 10000 == 0 && n < 1000000){
                System.out.println(n / 10000);
            }
        }

//        while(t-- > 0){
//            int round = 0;
//            int n = s.nextInt();
//            for(int j = 1; j <= n; j++) {
//                int count = 0;
//                String m = Integer.toString(j);
//                for (int i = 0; i < m.length(); i++) {
//                    if (m.charAt(i) != '0') {
//                        count++;
//                    }
//                }
//                if(count == 1){
//                    round++;
//                }
//            }
//            System.out.println(round);
//        }
    }
}
