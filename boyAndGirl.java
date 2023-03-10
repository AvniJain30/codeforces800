import java.util.HashSet;
import java.util.Scanner;

public class boyAndGirl {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        HashSet<Character> hs = new HashSet<>();
        for(char i : s.toCharArray()){
            hs.add(i);
        }

        if(hs.size() % 2 == 0){
            System.out.println("CHAT WITH HER!");
        }
        else{
            System.out.println("IGNORE HIM!");
        }
    }
}
