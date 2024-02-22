import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        TreeSet<Integer> set = new TreeSet<>();
        StringTokenizer s = new StringTokenizer(br.readLine());
        for (int i=0;i<a;i++){
            set.add(Integer.parseInt(s.nextToken()));
        }
        for (int i =0;i<b;i++){
            int c = Integer.parseInt(br.readLine());
            if (set.ceiling(c)!= null){
                System.out.println(set.ceiling(c));
            }else{
                System.out.println(-1);
            }
        }
    }
}