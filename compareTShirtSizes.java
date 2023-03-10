import java.util.Scanner;

public class compareTShirtSizes {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        while(t-- > 0){
            String a = s.next();
            String b = s.next();
            if(a.contains("M")){
                if(b.contains("S")){
                    System.out.println(">");
                }
                else if(b.contains("L")){
                    System.out.println("<");
                }
                else{
                    System.out.println("=");
                }
            }
            else if(b.contains("M")){
                if(a.contains("S")){
                    System.out.println("<");
                }
                else if(a.contains("L")){
                    System.out.println(">");
                }
                else{
                    System.out.println("=");
                }
            }
            else if(a.contains("S") && b.contains("L")){
                System.out.println("<");
            }
            else if(b.contains("S") && a.contains("L")){
                System.out.println(">");
            }
            else if(a.contains("S") && b.contains("S")){
                if(a.length() > b.length()){
                    System.out.println("<");
                }
                else if(a.length() < b.length()){
                    System.out.println(">");
                }
                else{
                    System.out.println("=");
                }
            }
            else if(a.contains("L") && b.contains("L")){
                if(a.length() > b.length()){
                    System.out.println(">");
                }
                else if(a.length() < b.length()){
                    System.out.println("<");
                }
                else{
                    System.out.println("=");
                }
            }
        }
    }
}
