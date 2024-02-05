import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String b = br.readLine();
        int cnt =0;
        if (s.equals(b)){
            System.out.println(0);
        }else {
            for (int i = 0; i < s.length(); i++) {
                if (i == s.length() - b.length() + 1) {
                    break;
                } else {
                    boolean bo = false;
                    if (s.charAt(i) == b.charAt(0)) {
                        for (int j = 0; j < b.length(); j++) {
                            if (s.charAt(i + j) == b.charAt(j)) {
                                bo = true;
                            } else {
                                bo = false;
                            }
                        }
                    }
                    if (bo) {
                        cnt++;
                    }
                }
            }if (cnt==0){
                System.out.println(-1);
            }else {
                System.out.println(cnt);
            }
        }
    }
}