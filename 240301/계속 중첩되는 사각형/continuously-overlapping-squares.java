import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a =Integer.parseInt(br.readLine());
        int [][] arr = new int[201][201];
        int sum =0;
        for (int i =0;i<a;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken())+100;
            int y1 =Integer.parseInt(st.nextToken())+100;
            int x2 =Integer.parseInt(st.nextToken())+100;
            int y2 =Integer.parseInt(st.nextToken()) +100;
            if (i%2==0){
                for (int j =x1;j<x2;j++){
                    for (int k=y1;k<y2;k++){
                        if (arr[j][k]==2){
                            sum--;
                        }
                        arr[j][k] = 1;
                    }
                }
            }else {
                for (int j =x1;j<x2;j++){
                    for (int k=y1;k<y2;k++){
                        arr[j][k] =2;
                        sum ++;
                    }
                }
            }
        }
        System.out.println(sum);
    }
}