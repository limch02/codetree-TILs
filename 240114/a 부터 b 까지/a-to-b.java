import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        while (a<=b){
            if (a%2==0){
                System.out.print(a+" ");
                a +=3;
            }else {
                System.out.print(a+" ");
                a*=2;
            }
        }
    }
}