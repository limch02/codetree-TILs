import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws  IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        for (int i = 0 ;i<2;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                s += st.nextToken();
            }
        }
        System.out.println(s);
    }
}