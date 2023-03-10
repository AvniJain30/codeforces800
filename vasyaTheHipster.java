import java.util.Scanner;

public class vasyaTheHipster {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        if(a < b){
            System.out.println(a + " " + (b - a) / 2);
        }
        else if(a > b){
            System.out.println(b + " " + (a - b) / 2);
        }
        else{
            System.out.println(a + " " + 0);
        }
    }
}
