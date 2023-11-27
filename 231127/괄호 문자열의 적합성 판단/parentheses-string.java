import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i =0;i<1;i++){
            boolean find = false;
            int left = 0;
            int right =0;
            String ps = br.readLine();
            if (ps.charAt(0)==')'){
                bw.write("No"+"\n");
            }else {
                for (int j =1;j<ps.length();j++){
                    if (ps.charAt(j)=='('){
                        left++;
                    }else {
                        right++;
                    }
                    if ((left+1)<right){
                        bw.write("No"+"\n");
                        find = true;
                        break;
                    }
                }
                if (find==false) {
                    if ((left + 1) == right) {
                        if (ps.charAt(ps.length() - 1) == ')') {
                            bw.write("Yes" + "\n");
                        } else {
                            bw.write("No" + "\n");
                        }
                    } else {
                        bw.write("No" + "\n");
                    }
                }
            }
        }
        bw.close();
    }
}