import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        Map<Long,Long> map = new HashMap<>();
        for (int i =0;i<a;i++){
            StringTokenizer st =new StringTokenizer(br.readLine());
            Long x = (long) Integer.parseInt(st.nextToken());
            Long y = (long) Integer.parseInt(st.nextToken());
            if (!map.containsKey(x)) {
                map.put(x,y);
            }else {
                if (y<map.get(x)){
                    map.put(x,y);
                }
            }
        }
        long sum = 0;
        for (long k : map.keySet()){
            sum += map.get(k);
        }
        System.out.println(sum);
    }
}