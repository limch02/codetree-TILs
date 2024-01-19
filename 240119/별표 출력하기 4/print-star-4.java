import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        for (int i = a;i>0;i--){
            for (int j = 1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 2;i<=a;i++){
            for (int j = 1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}