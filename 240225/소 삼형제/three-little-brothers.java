import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int cnt = 1;
        StringTokenizer st = new StringTokenizer(br.readLine());
        String s1 =st.nextToken();
        String s2 = st.nextToken();
        String s3 = st.nextToken();
        for (int i =0;i<a-1;i++){
            StringTokenizer s = new StringTokenizer(br.readLine());
            boolean t = false;
            for (int j=0;j<3;j++){
                String k = s.nextToken();
                if (k.equals(s1) || k.equals(s2)|| k.equals(s3)) {
                    t = true;
                }else {
                    t= false;
                    break;
                }
            }
            if (t){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}