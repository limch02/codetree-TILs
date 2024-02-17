import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        Map<Character,Integer> map = new LinkedHashMap<>();
        for (int i =0;i<s.length();i++){
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                map.put(c,map.get(c)+1);
            }else {
                map.put(c,1);
            }
        }
        boolean t = false;
        for (char k : map.keySet()){
            if (map.get(k)==1){
                t = true;
                System.out.println(k);
                break;
            }
        }
        if (!t){
            System.out.println("None");
        }
    }
}