import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int i =1;
        int cnt =0;
        while (true){
            String s = br.readLine();
            if (s.equals("0")){
                break;
            }
            cnt++;
            if (i%2==1){
                sb.append(s).append("\n");
            }
            i++;
        }
        System.out.println(cnt);
        System.out.println(sb);
    }
}