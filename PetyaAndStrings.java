import java.util.Scanner;

public class PetyaAndStrings {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        String s1 = sc.nextLine().toLowerCase();
        String s2 = sc.nextLine().toLowerCase();
        int count = 0;

        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) < s2.charAt(i)){
                count = -1;
                break;
            }
            else if(s1.charAt(i) > s2.charAt(i)){
                count = 1;
                break;
            }
            else{
                count = 0;
            }
        }

        System.out.println(count);
    }
}
