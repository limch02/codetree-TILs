import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int [] arr = new int[101];
        boolean t = false;
        for (int i =0;i<a;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            for (int j=n;j<=m;j++){
                arr[j]++;
            }
        }
        for (int i =0;i<arr.length;i++){
            if (arr[i]==a){
                t= true;
            }
        }
        if (t){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}