import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String b = br.readLine();
        boolean bo = false;
        int p = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i == s.length() - b.length() + 1) {
                break;
            } else {
                if (s.charAt(i) == b.charAt(0)) {
                    for (int j = 0; j < b.length(); j++) {
                        if (s.charAt(i + j) == b.charAt(j)) {
                            bo = true;
                        } else {
                            bo = false;
                        }
                    }
                }
                if (bo){
                    p = i;
                    break;
                }
            }
        }
        if (bo) {
            System.out.println(p);
        }else{
            System.out.println(-1);
        }
    }
}