import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map <Integer,Integer> map = new TreeMap<>();
        int a = Integer.parseInt(br.readLine());
        for (int i =0;i<a;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            switch (s){
                case "add":
                    int n = Integer.parseInt(st.nextToken());
                    int m = Integer.parseInt(st.nextToken());
                    map.put(n,m);
                    break;
                case "remove":
                    int b = Integer.parseInt(st.nextToken());
                    map.remove(b);
                    break;
                case "find":
                    int c = Integer.parseInt(st.nextToken());
                    if (map.containsKey(c)){
                        System.out.println(map.get(c));
                    }else {
                        System.out.println("None");
                    }
                    break;
                case "print_list":
                    if (map.isEmpty()){
                        System.out.println("None");
                    }else {
                        Iterator<Map.Entry<Integer, Integer>> it = map.entrySet().iterator();
                        while(it.hasNext()) {
                            Map.Entry<Integer, Integer> entry = it.next();
                            System.out.print(entry.getValue()+" ");
                        }
                        System.out.println();
                    }
            }
        }
    }
}