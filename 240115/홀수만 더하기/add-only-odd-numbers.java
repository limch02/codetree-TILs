import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int sum = 0;
        for (int i =1; i <=a;i++){
            int b = Integer.parseInt(br.readLine());
            if (b%2==1){
                if (b%3==0) {
                    sum += b;
                }
            }
        }
        System.out.println(sum);
    }
}