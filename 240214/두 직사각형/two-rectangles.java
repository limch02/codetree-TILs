import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [][] arr = new int[101][101];
        boolean t = false;
        for (int i =0;i<2;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken());
            int m1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());
            int m2 = Integer.parseInt(st.nextToken());
            for (int j=n1;j<=n2;j++){
                for (int k = m1;k<=m2;k++){
                    if (arr[j][k]>=1){
                        t = true;
                    }
                    arr[j][k]++;
                }
            }
        }
        if (t){
            System.out.println("overlapping");
        }else {
            System.out.println("nonoverlapping");
        }
    }
}