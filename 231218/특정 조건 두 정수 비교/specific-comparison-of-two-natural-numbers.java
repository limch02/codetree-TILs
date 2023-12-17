import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        if (a<b){
            bw.write("1 ");
        }else {
            bw.write("0 ");
        }
        if (a==b){
            bw.write("1");
        }else {
            bw.write("0");
        }
        bw.close();
    }
}