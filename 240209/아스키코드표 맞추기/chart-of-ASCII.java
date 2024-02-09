import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i =0;i<5;i++){
            int a = Integer.parseInt(st.nextToken());
            System.out.print((char)a+" ");
        }
    }
}