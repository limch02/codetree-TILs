import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuffer sb = new StringBuffer();
        String s = st.nextToken();
        int a = Integer.parseInt(st.nextToken());
        if (s.length()==1){
            for(int i =0;i<a;i++){
                System.out.println(s);
            }
        }else{
            for (int i =0;i<a;i++){
                int n = Integer.parseInt(br.readLine());
                if (n == 1){
                    s = s.substring(1,s.length())+s.charAt(0);
                    System.out.println(s);
                } else if (n==2) {
                    s = s.charAt(s.length()-1)+s.substring(0,s.length()-1);
                    System.out.println(s);
                }else{
                    sb.append(s);
                    sb.reverse();
                    s = sb.toString();
                    System.out.println(s);
                }
            }
        }
    }
}