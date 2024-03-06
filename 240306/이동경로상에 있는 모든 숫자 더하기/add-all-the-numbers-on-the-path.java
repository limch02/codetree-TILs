import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int [][] arr = new int[n][n];
        String s = br.readLine();
        for (int i =0;i<n;i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            for (int j =0;j<n;j++){
                arr[i][j] = Integer.parseInt(st1.nextToken());
            }
        }
        int direc = 1;
        int x = n/2;
        int y = n/2;
        int sum = arr[x][y];
        for (int i=0;i<a;i++){
            char c = s.charAt(i);
            if (c =='L'){
                if (direc==1){
                    direc =4;
                }else {
                    direc--;
                }
            } else if (c=='R') {
                if (direc==4){
                    direc=1;
                }else {
                    direc++;
                }
            }else {
                if (direc==1){
                    if (x!=0){
                        x--;
                        sum += arr[x][y];
                    }
                } else if (direc==2) {
                    if (y!=n-1){
                        y++;
                        sum+=arr[x][y];
                    }

                } else if (direc == 3) {
                    if (x!=n-1){
                        x++;
                        sum += arr[x][y];
                    }
                }else {
                    if (y!=0){
                        y--;
                        sum += arr[x][y];
                    }
                }
            }
        }
        System.out.println(sum);
    }
}