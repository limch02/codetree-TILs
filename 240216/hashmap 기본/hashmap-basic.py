import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        Map <Integer,Integer> map = new HashMap<>();
        for (int i =0;i<a;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            switch (s){
                case "add":
                    int n = Integer.parseInt(st.nextToken());
                    int m = Integer.parseInt(st.nextToken());
                    map.put(n,m);
                    break;
                case "find":
                    int b = Integer.parseInt(st.nextToken());
                    if (map.containsKey(b)) {
                        System.out.println(map.get(b));
                    }else {
                        System.out.println("None");
                    }
                    break;
                case "remove":
                    int k = Integer.parseInt(st.nextToken());
                    map.remove(k);
                    break;
            }
        }
    }
}