import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        TreeSet<Integer> set = new TreeSet<>();
        for (int i =0;i<a;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            if (s.equals("add")) {
                int b = Integer.parseInt(st.nextToken());
                set.add(b);
            } else if (s.equals("remove")) {
                int c= Integer.parseInt(st.nextToken());
                set.remove(c);
            } else if (s.equals("find")) {
                int d = Integer.parseInt(st.nextToken());
                if (set.contains(d)) {
                    System.out.println("true");
                }else {
                    System.out.println("false");
                }
            } else if (s.equals("lower_bound")) {
                int e = Integer.parseInt(st.nextToken());
                if (set.ceiling(e)!=null) {
                    System.out.println(set.ceiling(e));
                }else {
                    System.out.println("None");
                }
            } else if (s.equals("upper_bound")) {
                int f = Integer.parseInt(st.nextToken());
                if (set.higher(f)!= null) {
                    System.out.println(set.higher(f));
                }else {
                    System.out.println("None");
                }
            } else if (s.equals("largest")) {
                if (set.isEmpty()){
                    System.out.println("None");
                }else {
                    System.out.println(set.last());
                }
            }else {
                if (set.isEmpty()){
                    System.out.println("None");
                }else {
                    System.out.println(set.first());
                }
            }
        }
    }
}