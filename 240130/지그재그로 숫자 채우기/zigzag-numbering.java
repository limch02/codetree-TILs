import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer s = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(s.nextToken());
        int m = Integer.parseInt(s.nextToken());
        int [][] arr = new int[n][m];
        int c =0;
        int cnt = 0;
        for (int i = 0;i<m;i++){
            int b =0;
            if (i==0){
                for (int j =0;j<n;j++) {
                    arr[b][c] = cnt;
                    b++;
                    cnt++;
                }
                c++;
            } else if (i%2==0){
                cnt+=n+1;
                for (int j =0;j<n;j++) {
                    arr[b][c]= cnt;
                    b++;
                    cnt++;
                }
                c++;
            }else {
                cnt += n -1;
                for (int j =0;j<n;j++) {
                    arr[b][c] = cnt;
                    cnt--;
                    b++;
                }
                c++;
            }
        }
        for (int i = 0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}