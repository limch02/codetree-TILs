import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String a = st.nextToken();
        String b = st.nextToken();
        String s = "";
        for (int i =0;i<a.length();i++){
            if (b.equals(String.valueOf(a.charAt(i)))){
                s = String.valueOf(i);
                break;
            }
        }
        if (s.isEmpty()) {
            System.out.print("No");
        }else {
            System.out.println(s);
        }
    }
}