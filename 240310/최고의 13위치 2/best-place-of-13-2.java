import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int [][] arr = new int[a][a];
        for (int i =0;i<a;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j=0;j<a;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int sum =0;
        int max = 0;
        ArrayList<Integer> s = new ArrayList<>();
        for (int i =0;i<a;i++){
            for (int j =0;j<a-2;j++){
                sum += arr[i][j]+arr[i][j+1]+arr[i][j+2];
                s.add(sum);
                sum =0;
            }
        }
        Collections.sort(s);
        System.out.println(s.get(s.size()-1)+s.get(s.size()-2));
    }
}