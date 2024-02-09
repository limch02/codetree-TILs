import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        char c = st.nextToken().charAt(0);
        int a = (int)c+1;
        if (a==123){
            System.out.println((char) 97);
        }else {
            System.out.println((char) a);
        }
    }
}