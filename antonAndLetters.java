import java.util.HashSet;
import java.util.Scanner;

public class antonAndLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashSet<Character> h = new HashSet<>();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != '{' && s.charAt(i) != '}' && s.charAt(i) != ',' && s.charAt(i) != ' '){
                h.add(s.charAt(i));
            }
        }

        System.out.println(h.size());
    }
}
