import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        HashMap<Integer,Integer> map = new HashMap<>();
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for (int i =0;i<a;i++){
            int c = Integer.parseInt(st1.nextToken());
            if (map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else {
                map.put(c,1);
            }
        }
        List<Integer> keySet = new ArrayList<>(map.keySet());
        keySet.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (map.get(o1).compareTo(map.get(o2))==0){
                    return o2.compareTo(o1);
                }else {
                    return map.get(o2).compareTo(map.get(o1));
                }
            }
        });
        int j =1;
        for (int key : keySet){
            System.out.print(key+" ");
            if (j==b){
                break;
            }
            j++;
        }
    }
}