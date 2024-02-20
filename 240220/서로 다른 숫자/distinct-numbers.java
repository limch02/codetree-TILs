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
            if (!set.contains(a)){
                set.add(a);
            }
        }
        System.out.println(set.size());
    }
}