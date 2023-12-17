import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        if (a%2==0){
            a= a/2;
        }
        if (a%2==1){
            a = a+1;
            a= a/2;
        }
        bw.write(a+"");
        bw.close();
    }
}