import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        for (int i = 1;i<=a;i++){
            for (int j = 1;j<=i;j++){
                System.out.println("*");
            }
            System.out.println();
        }
        for (int i = a-1;i>0;i--){
            for (int j = 1;j<=i;j++){
                System.out.println("*");
            }
            System.out.println();
        }
    }
}