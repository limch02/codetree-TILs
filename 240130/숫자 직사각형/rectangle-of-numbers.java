import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int cnt = 1;
        for(int i = 0; i <a; i++) {
            for (int j=0;j<b;j++){
                System.out.print(cnt+" ");
                cnt++;
            }
            System.out.println();
        }
    }
}