import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int cnt =0;
        int i = 1;
        while (true){
            if (cnt==2){
                break;
            }
            if ((a*i)%5==0) {cnt++;}
            System.out.print(a*i+" ");
            i++;
        }
    }
}