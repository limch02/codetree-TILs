import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        for (int i = 0;i<a;i++){
            for (int j =a-i;j>0;j--){
                System.out.print("*");
            }
            for (int j = 0;j<(2*i);j++){
                System.out.print(" ");
            }
            for (int j =a-i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}