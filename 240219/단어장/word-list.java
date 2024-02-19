import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String,Integer>map = new TreeMap<>();
        int a = Integer.parseInt(br.readLine());
        for (int i =0;i<a;i++){
            String s = br.readLine();
            if (map.containsKey(s)){
                map.put(s,map.get(s)+1);
            }else {
                map.put(s, 1);
            }
        }
        Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();
        while(it.hasNext()) {
            Map.Entry<String, Integer> entry = it.next();
            System.out.print(entry.getKey()+" " + entry.getValue());
            System.out.println();
        }
    }
}