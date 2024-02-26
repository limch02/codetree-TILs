import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        StringTokenizer st= new StringTokenizer(br.readLine());
        int [] arr = new int[a];
        for (int i =0;i<a;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int a1 =Integer.MAX_VALUE;
        int a2 = Integer.MAX_VALUE;
        int a3 =Integer.MAX_VALUE;
        int cnt =0;
        for (int i =0;i<a;i++){
            a1 = arr[i];
            for (int j =i+1;j<a;j++){
                if (arr[j]>a1){
                    a2 = arr[j];
                }
                for (int k =j+1;k<a;k++){
                    if (arr[k]>a2){
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}