import java.util.Scanner;

public class AntonAndDanik {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();    //no. of times game was played
        String s = sc.next();      //sequence of who won the game
        int A = 0, D = 0;
        for(int i = 0; i < num; i++){
            if(s.charAt(i) == 'A'){
                A++;
            }
            else{
                D++;
            }
        }

        if(A > D){
            System.out.println("Anton");
        }
        else if(D > A){
            System.out.println("Danik");
        }
        else{
            System.out.println("Friendship");
        }
    }
}
