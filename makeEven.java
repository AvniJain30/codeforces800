import java.util.Scanner;

public class makeEven {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        while(t-- > 0){
            String sc = s.next();
            int n = Integer.parseInt(sc);
            if(n % 2 == 0){
                System.out.println(0);
            }
            else{
                if(Integer.parseInt(String.valueOf(sc.charAt(0))) % 2 == 0){
                    System.out.println(1);
                }
                else {
                     int i = 1;
                     boolean b = false;
                     while(i < sc.length()) {
                     if (Integer.parseInt(String.valueOf(sc.charAt(i))) % 2 == 0) {
                        System.out.println(2);
                        b = true;
                        break;
                     }
                     i++;
                }

                if(b == false){
                    System.out.println(-1);
                }
                }
            }
        }
    }
}
