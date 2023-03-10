import java.util.Scanner;

public class checkSubstring {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        int s1Len = s1.length(), count = 0;
        String s2 = sc.next();
        String arr[] = new String[s1Len*(s1Len + 1) / 2];

        for(int i = 0; i < s1Len; i++){
            String temp = "";
            for(int j = i; j < s1Len; j++){
                temp += s1.charAt(j);
                arr[count++] = temp;
            }
        }

        boolean b = false;
        for(int k = 0; k < arr.length; k++){
            if(arr[k].equals(s2)){
                b = true;
                break;
            }
            else{
                b = false;
            }
        }

        if(b == true){
            System.out.println("Yes");
        }
        else{
            System.out.println("no");
        }
    }
}
