import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map <Integer,Integer> map = new TreeMap<>();
        int a = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i =0;i<a;i++){
            int b = Integer.parseInt(st.nextToken());
            if (!map.containsKey(b)){
                map.put(b,i+1);
            }
        }
        Iterator<Map.Entry<Integer, Integer>> it = map.entrySet().iterator();
        while(it.hasNext()) {
            Map.Entry<Integer, Integer> entry = it.next();
            System.out.println(entry.getKey()+" " + entry.getValue());
        }
    }
}