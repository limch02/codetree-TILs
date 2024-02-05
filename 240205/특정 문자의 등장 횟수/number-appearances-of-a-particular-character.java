import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int cntee = 0;
        int cnteb = 0;
        for (int i = 0 ; i<s.length();i++){
            if (i==s.length()-1){
                break;
            }else {
                if (s.charAt(i) == 'e') {
                    if (s.charAt(i+1)=='e'){
                        cntee++;
                    } else if (s.charAt(i+1)=='b') {
                        cnteb++;
                    }
                }
            }
        }
        System.out.println(cntee+" "+cnteb);
    }
}