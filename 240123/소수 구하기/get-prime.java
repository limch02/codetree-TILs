import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer s = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(s.nextToken());
        ArrayList<Integer> arr = new ArrayList<>();
        for (int j = 2;j<=n;j++){
            int sum =0;
            for (int k = 1;k<=j;k++){
                if (j%k==0){
                    sum++;
                }
            }
            if (sum == 2){
                arr.add(j);
            }
        }
        for (int i =0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
    }
}