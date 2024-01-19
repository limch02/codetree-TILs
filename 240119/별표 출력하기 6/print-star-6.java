import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        for (int i = 0;i<a;i++){
            for (int j =0;j<2*i;j++){
                System.out.print(" ");
            }
            for (int j = (2*(a-i))-1;j>0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1;i<a;i++){
            for (int j =2*(a-i-1);j>0;j--){
                System.out.print(" ");
            }
            for (int j = 0;j<(2*i)+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}