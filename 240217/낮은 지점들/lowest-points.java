import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        Map<Integer,Integer> map = new LinkedHashMap<>();
        for (int i =0;i<a;i++){
            StringTokenizer st =new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            if (!map.containsKey(x)) {
                map.put(x,y);
            }else {
                if (y<map.get(x)){
                    map.put(x,y);
                }
            }
        }
        int sum = 0;
        for (int k : map.keySet()){
            sum += map.get(k);
        }
        System.out.println(sum);
    }
}