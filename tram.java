import java.util.Scanner;

public class tram {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int tp = 0, hp = tp;

        for(int i = 0; i < n; i++){
            int a = s.nextInt();
            int b = s.nextInt();
            if(i == 0){
                tp = b;
            }
            else{
                tp = tp - a + b;
            }

            if(tp > hp){
                hp = tp;
            }
        }

        System.out.println(hp);

        //Another way

        //int arr[][] = new int[n][2];
        //        for(int i = 0; i < n; i++){
//            arr[i][0] = s.nextInt();
//            arr[i][1] = s.nextInt();
//        }
//        int tp = arr[0][1], hp = arr[0][1];
//
//        for(int j = 1; j < n; j++){
//            tp = tp - arr[j][0] + arr[j][1];
//            if(tp > hp){
//                hp = tp;
//            }
//        }
//        System.out.println(hp);
    }
}
