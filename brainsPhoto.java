import java.util.Scanner;

public class brainsPhoto {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        char arr[][] = new char[n][m];
        boolean b = false;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = s.next().charAt(0);
                if(arr[i][j] == 'C' || arr[i][j] == 'M' || arr[i][j] == 'Y'){
                    b = true;
                    break;
                }
                else{
                    b = false;
                }
            }
            if(b == true){
                break;
            }
        }

        if(b == false){
            System.out.println("#Black&White");
        }
        else{
            System.out.println("#Color");
        }
    }
}
