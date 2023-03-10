import java.util.Scanner;

public class foxAndSnake {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int count = 0;

        for(int i = 0; i < n; i++){
            if(i % 2 == 0) {
                for (int j = 0; j < m; j++) {
                    System.out.print('#');
                }
                System.out.println();
            }
            else {
                count++;
                if (count % 2 != 0) {
                    for (int j = 0; j < m - 1; j++) {
                        System.out.print('.');
                    }
                    System.out.print('#');
                    System.out.println();
                }
                else{
                    System.out.print('#');
                    for (int j = 0; j < m - 1; j++) {
                        System.out.print('.');
                    }
                    System.out.println();
                }
            }
        }
    }
}
