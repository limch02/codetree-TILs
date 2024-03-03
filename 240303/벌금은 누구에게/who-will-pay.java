import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        Map <Integer,Integer> map = new HashMap<>();
        for (int i =0;i<b;i++){
            int n = Integer.parseInt(br.readLine());
            if (map.containsKey(n)) {
                map.put(n,map.get(n)+1);
            }else {
                map.put(n,1);
            }
        }
        boolean t = false;
        int f = 0;
        for (int i:map.keySet()){
            if (map.get(i)==c){
                t = true;
                f =i;
            }
        }
        if (t){
            System.out.println(f);
        }else{
            System.out.println(-1);
        }
    }
}