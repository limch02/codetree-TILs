import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        Map<String,Integer>map = new HashMap<>();
        for (int i =0;i<a;i++){
            String s = br.readLine();
            if (map.containsKey(s)){
                map.put(s,map.get(s)+1);
            }else {
                map.put(s,1);
            }
        }
        int max = Integer.MIN_VALUE;
        for (String string:map.keySet()){
            if (max < map.get(string)) {
                max = map.get(string);
            }
        }
        System.out.println(max);
    }
}