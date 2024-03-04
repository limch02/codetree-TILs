import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int [][] arr = new int[a][a];
        int cnt =0;
        for (int i =0;i<a;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j=0;j<a;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i =0;i<a;i++){
            for (int j =0;j<a;j++){
                if (j==0){
                    if (i!=0&&i!=a-1){
                        if (arr[i-1][j]==1&&arr[i][j+1]==1&&arr[i+1][j]==1){
                            cnt++;
                        }
                    }
                }else if (j==a-1){
                    if (i!=0&&i!=a-1){
                        if (arr[i-1][j]==1&&arr[i][j-1]==1&&arr[i+1][j]==1){
                            cnt++;
                        }
                    }
                } else{
                    if (i==0){
                        if (arr[i][j+1]==1&&arr[i][j-1]==1&&arr[i+1][j]==1){
                            cnt++;
                        }
                    } else if (i==a-1) {
                        if (arr[i][j+1]==1&&arr[i][j-1]==1&&arr[i-1][j]==1){
                            cnt++;
                        }
                    }else {
                        if (arr[i][j+1]==1&&arr[i][j-1]==1&&arr[i-1][j]==1){
                            cnt++;
                        } else if (arr[i][j+1]==1&&arr[i][j-1]==1&&arr[i+1][j]==1){
                            cnt++;
                        } else if (arr[i][j+1]==1&&arr[i-1][j]==1&&arr[i+1][j]==1){
                            cnt++;
                        } else if (arr[i][j-1]==1&&arr[i-1][j]==1&&arr[i+1][j]==1){
                            cnt++;
                        }
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}