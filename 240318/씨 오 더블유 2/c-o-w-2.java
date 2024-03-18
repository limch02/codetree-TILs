import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int cnt =0;
        for (int i =0;i<a;i++){
            if (s.charAt(i)=='C') {
                for (int j = i + 1; j < a; j++) {
                    if (s.charAt(j) == 'O') {
                        for (int k = j + 1; k < a; k++){
                            if (s.charAt(k)=='W'){
                                cnt++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}