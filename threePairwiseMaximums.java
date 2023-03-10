import java.util.Scanner;

public class threePairwiseMaximums {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        while(t-- > 0){
            int x = s.nextInt();
            int y = s.nextInt();
            int z = s.nextInt();

            if(x == y && y == z){
                System.out.println("YES");
                System.out.println(x + " " + y + " " + z);
            }
            else if(x == y && z < x){
                System.out.println("YES");
                System.out.println(x + " " + z + " " + z);
            }
            else if(y == z && x < y){
                System.out.println("YES");
                System.out.println(x + " " + x + " " + y);
            }
            else if(z == x && y < z){
                System.out.println("YES");
                if(y == 1){
                    System.out.println(x + " " + y + " " + y);
                }
                else {
                    System.out.println(x + " " + y-- + " " + y);
                }
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
