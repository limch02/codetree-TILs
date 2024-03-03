import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int x= 0;
        int y= 0;
        for (int i=0;i<a;i++){
            StringTokenizer st= new StringTokenizer(br.readLine());
            String s =st.nextToken();
            int k = Integer.parseInt(st.nextToken());
            if (s.equals("N")) {
                y+=k;
            } else if (s.equals("E")) {
                x+=k;
            } else if (s.equals("S")) {
                y-=k;
            }else {
                x-=k;
            }
        }
        System.out.println(x+" "+y);
    }
}