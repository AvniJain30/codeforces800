import java.util.Scanner;

public class helpFarAwayKingdom {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char ch[] = s.toCharArray();

        for(int i = 0; i < ch.length; i++){
            if(ch[i] == '.') {
                if (ch[i - 1] != '9') {
                    if (ch[i + 1] >= '5') {
                        ch[i - 1]++;
                        for(int j = 0; j < i; j++){
                            System.out.print(ch[j]);
                        }
                        //break;
                    }
                    else{
                        for(int j = 0; j < i; j++){
                            System.out.print(ch[j]);
                        }
                        //break;
                    }
                }
                else{
                    //s = "GOTO Vasilisa.";
                    System.out.println("GOTO Vasilisa.");
                    //break;
                }
            }
        }
    }
}
