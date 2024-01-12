import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        String b = st.nextToken();
        StringTokenizer s = new StringTokenizer(br.readLine());
        int c = Integer.parseInt(s.nextToken());
        String d = s.nextToken();
        if((a>=20&&b.equals("M"))||(c>=20&&d.equals("M"))){
            sb.append(1);
        } else{
            sb.append(0);
        }
        System.out.print(sb);
    }
}