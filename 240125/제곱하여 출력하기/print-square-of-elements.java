import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i =0;i<a;i++){
            int b = Integer.parseInt(st.nextToken());
            System.out.print((int)Math.pow(b,2)+" ");
        }
    }
}