import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws  IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        String s = st.nextToken();
        String k = st.nextToken();
        if (s.length()>k.length()){
            System.out.println(s+" "+s.length());
        } else {
            System.out.println(k+" "+k.length());
        }
    }
}