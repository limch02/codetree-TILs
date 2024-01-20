import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        for (int i = n;i>0;i--){
            for (int j = n;j>0;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}