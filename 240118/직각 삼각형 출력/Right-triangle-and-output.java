import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        for (int i = 0; i<a; i++) {
            for (int j = 1; j <= 2*i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}