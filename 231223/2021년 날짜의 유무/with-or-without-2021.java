import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        if (a ==2){
            if (b<29){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        } else if (a<8&&a%2==0){
            if (b<31){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        } else if (a<=7&&a%2==1) {
            if (b<32){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        } else if (a>=8&&a%2==0&&a<13) {
            if (b<32){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        } else if (a>7&&a%2==1&&a<13) {
            if (b<31){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        } 
    }
}