import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String k = br.readLine();
        int cnt =0;
        boolean t = false;
        for (int i =0;i<k.length();i++){
            k= k.substring(1,k.length())+k.charAt(0);
            cnt++;
            if (k.equals(s)) {
                t = true;
                System.out.println(cnt);
                break;
            }
        }
        if(!t){
            System.out.println(-1);
        }
    }
}