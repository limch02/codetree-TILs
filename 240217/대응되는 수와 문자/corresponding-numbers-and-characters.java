import java.util.*;
import java.io.*;

public class Main {
    public static boolean isNumberic(String str) {
        return str.chars().allMatch(Character::isDigit);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        Map<String,Integer> map= new HashMap<>();
        for (int i =0;i<a;i++){
            StringTokenizer s = new StringTokenizer(br.readLine());
            String k = s.nextToken();
            map.put(k,i+1);
        }
        for (int i = 0;i<b;i++){
            String t =br.readLine();
            if (isNumberic(t)){
                for (String string : map.keySet()){
                    if (map.get(string)==Integer.valueOf(t)){
                        System.out.println(string);
                    }
                }
            }else {
                System.out.println(map.get(t));
            }
        }
    }
}