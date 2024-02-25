import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i =0;i<a;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            if (s.equals("push")){
                int b = Integer.parseInt(st.nextToken());
                queue.add(-b);
            } else if (s.equals("pop")) {
                System.out.println(-queue.peek());
                queue.poll();
            } else if (s.equals("size")) {
                System.out.println(queue.size());
            } else if (s.equals("empty")) {
                if (queue.isEmpty()){
                    System.out.println(1);
                }else {
                    System.out.println(0);
                }
            } else{
                System.out.println(-queue.peek());
            }
        }
    }
}