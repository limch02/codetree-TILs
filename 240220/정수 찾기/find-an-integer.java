import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Set <Integer> set = new HashSet<>();
        for (int i =0;i<N;i++){
            int a  = Integer.parseInt(st.nextToken());
            set.add(a);
        }
        int m = Integer.parseInt(br.readLine());
        StringTokenizer s = new StringTokenizer(br.readLine());
        for (int i =0;i<m;i++){
            int b  = Integer.parseInt(s.nextToken());
            if (set.contains(b)){
                System.out.println(1);
            }else {
                System.out.println(0);
            }
        }
    }
}