import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        if (a%2==0){
            bw.write("even\n");
        }else {
            bw.write("odd\n");
        }
        if (a%2==0){
            bw.write("even");
        }else {
            bw.write("odd");
        }
        bw.close();
    }
}