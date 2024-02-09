import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a =Integer.parseInt(st.nextToken());
        String s = st.nextToken();
        int cnt =0;
        for (int i =0;i<a;i++){
            String k = br.readLine();
            if ( s.equals(k)){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}