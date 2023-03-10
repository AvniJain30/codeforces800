import java.util.Scanner;

public class restoring3numbers {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int u = s.nextInt();      //a + b
        int v = s.nextInt();      //a + c
        int x = s.nextInt();      //b + c
        int y = s.nextInt();      // a + b + c

        int sum = Math.max(Math.max(Math.max(u, v),x), y);            // a+b+c
        if(sum == u){
            int a = sum - y;
            int b = sum - v;
            int c = sum - x;
            System.out.println(a + " " + b + " " + c);
        }
        else if(sum == v){
            int a = sum - u;
            int b = sum - y;
            int c = sum - x;
            System.out.println(a + " " + b + " " + c);
        }
        else if(sum == x){
            int a = sum - u;
            int b = sum - v;
            int c = sum - y;
            System.out.println(a + " " + b + " " + c);
        }
        else{
            int a = sum - u;
            int b = sum - v;
            int c = sum - x;
            System.out.println(a + " " + b + " " + c);
        }

    }
}
