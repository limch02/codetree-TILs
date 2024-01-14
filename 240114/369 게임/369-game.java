import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        for (int i =1;i<=a;i++){
            boolean t = true;
            String s = String.valueOf(i);
            if (i%3==0){
                t = false;
            }else {
                for (int j = 0; j < s.length(); j++) {
                    if ((s.charAt(j) - 48) == 3) {
                        t = false;
                    } else if ((s.charAt(j) - 48) == 6) {
                        t = false;
                    } else if ((s.charAt(j) - 48) == 9) {
                        t = false;
                    }
                }
            }
            if (!t){
                System.out.print(0+" ");
            }else {
                System.out.print(i+" ");
            }
        }
    }
}