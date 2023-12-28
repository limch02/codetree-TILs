import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int[]arr = new int[a];
        int [] arr2 = new int[a];
        StringTokenizer s = new StringTokenizer(br.readLine());
        for (int i =0;i<a;i++){
            arr[i] = Integer.parseInt(s.nextToken());
        }
        StringTokenizer s1 = new StringTokenizer(br.readLine());
        for (int i =0;i<a;i++){
            arr2[i] = Integer.parseInt(s1.nextToken());
        }
        Arrays.sort(arr);
        Arrays.sort(arr2);
        boolean ans = true;
        for (int i =0;i<a;i++){
            if (arr[i]==arr2[i]){
                ans = true;
            }else {
                ans = false;
                break;
            }
        }
        if (ans){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}