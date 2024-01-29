import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int [][] arr = new int[2][4];
        for (int i = 0;i<2;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0;j<4;j++){
                int a = Integer.parseInt(st.nextToken());
                arr[i][j] = a;
            }
        }
        double sum1 =0;
        double sum2 =0;
        for (int i =0;i<4;i++){
            sum1 += arr[0][i];
            sum2 += arr[1][i];
        }
        sb.append(sum1/4).append(" ").append(sum2/4).append("\n");
        sum1=0;
        sum2=0;
        double sum3 = 0;
        double sum4 =0;
        for (int i =0;i<2;i++){
            sum1 += arr[i][0];
            sum2 += arr[i][1];
            sum3 += arr[i][2];
            sum4+= arr[i][3];
        }
        sb.append(sum1/2).append(" ").append(sum2/2).append(" ").append(sum3/2).append(" ").append(sum4/2).append("\n");
        sb.append((sum1+sum2+sum3+sum4)/8);
        System.out.println(sb);
    }
}