import java.util.Scanner;

public class fileName {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int count = 0;
        int maxCount = 0;
        boolean b = false;
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == 'x'){
                count++;
                b = true;
            }
            else{
                if(count > 2){
                    maxCount += (count - 2);
                }
                b = false;
                count = 0;
            }
        }

        if(b == true && count > 2){
            System.out.println(maxCount + count - 2);
        }
        else {
            if (maxCount == 0 && count > 2) {
                System.out.println(count - 2);
            } else {
                System.out.println(maxCount);
            }
        }
    }
}
