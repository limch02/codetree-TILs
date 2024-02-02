import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws  IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = br.readLine();
        Map<Character,Integer>map = new HashMap<>();
        int i =0;
        while (true){
            if (i ==0){
                map.put(s.charAt(i),1);
            }else if (s.length()==i){
                sb.append(s.charAt(i-1)).append(map.get(s.charAt(i-1)));
                System.out.println(sb.length());
                System.out.println(sb);
                break;
            }else {
                if (s.charAt(i - 1) == s.charAt(i)) {
                    map.put(s.charAt(i),map.get(s.charAt(i))+1);
                }else {
                    sb.append(s.charAt(i-1)).append(map.get(s.charAt(i-1)));
                    map.put(s.charAt(i),1);
                }
            }
            i++;
        }
    }
}