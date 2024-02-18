import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map <String,Integer> map = new TreeMap<>();
        int a = Integer.parseInt(br.readLine());
        for (int i =0;i<a;i++){
            String s = br.readLine();
            if (!map.containsKey(s)){
                map.put(s,1);
            }else{
                map.put(s,map.get(s)+1);
            }
        }
        for (String string:map.keySet()){
            double d = (double)map.get(string)/a*100;
            String k = String.format("%.4f",d);
            System.out.println(string+" " +k);
        }
    }
}