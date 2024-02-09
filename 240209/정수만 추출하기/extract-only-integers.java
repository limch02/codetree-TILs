import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String s1 = st.nextToken();
        String s2 = st.nextToken();
        String k1 = "";
        String k2 = "";
        for (int i = 0;i<s1.length();i++){
            if (s1.charAt(i)>='0'&&s1.charAt(i)<='9'){
                k1 += s1.charAt(i);
            }else{
                break;
            }
        }
        for (int i = 0;i<s2.length();i++){
            if (s2.charAt(i)>='0'&&s2.charAt(i)<='9'){
                k2 += s2.charAt(i);
            }else{
                break;
            }
        }
        System.out.println(Integer.parseInt(k1)+Integer.parseInt(k2));
    }
}