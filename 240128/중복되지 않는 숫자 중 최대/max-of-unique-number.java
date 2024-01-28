import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<Integer,Integer> map = new HashMap<>();
        for (int i =0 ;i<a;i++){
            int b = Integer.parseInt(st.nextToken());
            if (map.containsKey(b)) {
                map.put(b,map.get(b)+1);
            }else {
                map.put(b,1);
            }
        }
        int max = Integer.MIN_VALUE;
        for (int key : map.keySet()){
            if (map.get(key)>max){
                max = map.get(key);
            } else if (max == map.get(key)) {
                max = -1;
            }
        }
        System.out.println(max);
    }
}