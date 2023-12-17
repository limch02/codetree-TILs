import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        
        if (a%3==0){
            bw.write("YES\n");
        }else {
            bw.write("NO\n");
        }
        if (a%5==0){
            bw.write("YES");
        }else {
            bw.write("NO");
        }
        bw.close();
    }
}