import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String s = st.nextToken();
        int a = Integer.parseInt(st.nextToken());
        for (int i =0;i<a;i++){
            int n = Integer.parseInt(br.readLine());
            if (n == 1){
                s = s.substring(1,s.length())+s.charAt(0);
                System.out.println(s);
            } else if (n==2) {
                s = s.charAt(s.length()-1)+s.substring(0,s.length()-1);
                System.out.println(s);
            }else{
                String tmp ="";
                for (int j=s.length()-1;j>=0;j--){
                    tmp += s.charAt(j);
                }
                s = tmp;
                System.out.println(s);
            }
        }
    }
}