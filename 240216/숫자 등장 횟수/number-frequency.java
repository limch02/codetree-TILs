import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(stringTokenizer.nextToken());
        int b = Integer.parseInt(stringTokenizer.nextToken());
        Map <Integer,Integer> map = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i =0;i<a;i++){
            int k = Integer.parseInt(st.nextToken());
            if (!map.containsKey(k)){
                map.put(k,1);
            }else {
                map.put(k,map.get(k)+1);
            }
        }
        StringTokenizer s= new StringTokenizer(br.readLine());
        for (int i =0;i<b;i++){
            int c =Integer.parseInt(s.nextToken());
            if (map.containsKey(c)) {
                System.out.print(map.get(c) + " ");
            }else{
                System.out.print(0+" ");
            }
        }
    }
}