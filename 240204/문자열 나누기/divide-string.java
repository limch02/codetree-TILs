import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String s ="";
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0;i<a;i++){
            s+= st.nextToken();
        }
        for (int i=0;i<s.length();i++){
            System.out.print(s.charAt(i));
            if ((i+1)%5==0){
                System.out.println();
            }
        }
    }
}