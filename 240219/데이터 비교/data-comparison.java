import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> set = new HashSet<>();
        int a = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i =0;i<a;i++){
            set.add(Integer.parseInt(st.nextToken()));
        }
        int b= Integer.parseInt(br.readLine());
        StringTokenizer s = new StringTokenizer(br.readLine());
        for (int i= 0;i<b;i++){
            int c = Integer.parseInt(s.nextToken());
            if (set.contains(c)){
                System.out.print("1 ");
            }else {
                System.out.print("0 ");
            }
        }
    }
}