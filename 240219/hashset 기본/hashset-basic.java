import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> set = new HashSet<>();
        int a = Integer.parseInt(br.readLine());
        for (int i =0;i<a;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            switch (s){
                case "add":
                    int b = Integer.parseInt(st.nextToken());
                    set.add(b);
                    break;
                case "find":
                    int c = Integer.parseInt(st.nextToken());
                    if (set.contains(c)){
                        System.out.println("true");
                    }else {
                        System.out.println("false");
                    }
                    break;
                case "remove":
                    int d = Integer.parseInt(st.nextToken());
                    set.remove(d);
            }
        }
    }
}