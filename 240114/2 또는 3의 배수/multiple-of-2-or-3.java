import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        for (int i = 1; i <= a;i++){
            if (i%2==0){
                System.out.print(1+" ");
            } else if (i%3==0) {
                System.out.print(1+" ");
            }else {
                System.out.print(0+" ");
            }
        }
    }
}