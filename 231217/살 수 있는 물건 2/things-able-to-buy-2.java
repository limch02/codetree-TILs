import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        if (a<500){
            bw.write("no");
        } else if (a>=500&&a<1000) {
            bw.write("pen");
        } else if (a>=1000&&a<3000) {
            bw.write("mask");
        }else {
            bw.write("book");
        }
        bw.close();
    }
}