import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int max =Integer.MIN_VALUE;
        for (int i =0;i<10;i++){
            int b = Integer.parseInt(st.nextToken());
            if (b>max){
                max = b;
            }
        }
        System.out.println(max);
    }
}