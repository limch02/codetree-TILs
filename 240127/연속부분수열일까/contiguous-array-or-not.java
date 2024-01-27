import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        StringTokenizer s1 = new StringTokenizer(br.readLine());
        StringTokenizer s2 = new StringTokenizer(br.readLine());
        int [] arr1 = new int[n];
        int [] arr2 = new int[q];
        for (int i = 0;i<n;i++){
            int c= Integer.parseInt(s1.nextToken());
            arr1[i] = c;
        }
        for (int i = 0;i<q;i++){
            int c= Integer.parseInt(s2.nextToken());
            arr2[i] = c;
        }
        boolean t = true;
        for (int i = 0 ;i<n;i++) {
            if (arr1[i]==arr2[0]) {
                for (int j =0;j<q;j++){
                    if (arr1[i+j]!=arr2[j]) {
                        t = false;
                        break;
                    }
                }
                break;
            }else {
                t = false;
            }
        }
        if (t){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}