import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int i = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        while (i>=a){
            if (i%2==0) {
                System.out.print(i + " ");
            }
            i--;
        }
    }
}