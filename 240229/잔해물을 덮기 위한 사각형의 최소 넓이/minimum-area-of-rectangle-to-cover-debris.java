import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [][] arr = new int[2001][2001];
        int s1 = 0;
        int s2 = 0;
        int xmax = Integer.MIN_VALUE;
        int ymax = Integer.MIN_VALUE;
        int xmin = Integer.MAX_VALUE;
        int ymin = Integer.MAX_VALUE;
        for (int i =0;i<2;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken())+1000;
            int y1 = Integer.parseInt(st.nextToken())+1000;
            int x2 = Integer.parseInt(st.nextToken())+1000;
            int y2 = Integer.parseInt(st.nextToken())+1000;
            if (i==0) {
                for (int j = x1; j <= x2; j++) {
                    for (int k = y1; k <= y2; k++) {
                        if (arr[j][k] != 1) {
                            arr[j][k] = 1;
                            s1++;
                        }
                    }
                }
            }else {
                for (int j = x1; j < x2; j++) {
                    for (int k = y1; k < y2; k++) {
                        if (arr[j][k] == 1) {
                            arr[j][k] = 0;
                            s2++;
                        }
                    }
                }
            }
        }
        if (s1 == s2){
            System.out.println(0);
        }else{
            for (int i =0;i<2000;i++){
                for (int j =0;j<2000;j++){
                    if (arr[i][j]==1&&xmax<i){
                        xmax = i;
                    } else if (arr[i][j]==1&&xmin>i) {
                        xmin = i;
                    } else if (arr[i][j]==1&&ymax<j) {
                        ymax=j;
                    }else if (arr[i][j]==1&&ymin>j){
                        ymin = j;
                    }
                }
            }
            System.out.println((xmax-xmin)*(ymax-ymin+1));
        }

    }
}