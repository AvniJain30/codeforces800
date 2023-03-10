import java.util.Scanner;

public class ultraFastMathematician {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = "";

        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) == s2.charAt(i)){
                s3 += "0";
            }
            else{
                s3 += "1";
            }
        }

        System.out.println(s3);
    }
}
