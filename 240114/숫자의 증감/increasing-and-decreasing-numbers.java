import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String s= st.nextToken();
        int a = Integer.parseInt(st.nextToken());
        if (s.equals("A")){
            for (int i =  1;i<=a;i++){
                System.out.print(i+" ");
            }
        }else {
            for (int i = a;i>0;i--){
                System.out.print(i+" ");
            }
        }
    }
}