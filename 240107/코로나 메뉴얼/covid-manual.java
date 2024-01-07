import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        for (int i =0;i<3;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            int b = Integer.parseInt(st.nextToken());
            if (a.equals("Y")) {
                if (b>=37){
                    cnt++;
                }
            }
        }
        if (cnt>=2){
            sb.append("E");
        }else{
            sb.append("N");
        }
        System.out.println(sb);
    }
}