import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        StringTokenizer st= new StringTokenizer(br.readLine());
        int cnt=0;
        for (int i =0;i<a;i++){
            int b = Integer.parseInt(st.nextToken());
            if (b==2){
                cnt++;
            }
            if (cnt==3){
                System.out.println(i+1);
                break;
            }
        }
    }
}