import java.util.HashSet;
import java.util.Scanner;

public class pangram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        String s = sc.next().toLowerCase();

        HashSet<Character> hs = new HashSet<>();
        for(char i : s.toCharArray()){
            hs.add(i);
        }
        if(hs.size() == 26){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
