import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        for (int k = 0;k<2;k++) {
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < a; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}