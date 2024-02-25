import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer s = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(s.nextToken());
        int b = Integer.parseInt(s.nextToken());
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i =0;i<a;i++){
            queue.add(-Integer.parseInt(st.nextToken()));
        }
        for (int i =0;i<b;i++){
            int c = -queue.peek();
            queue.poll();
            queue.add(-(c-1));
        }
        System.out.println(-queue.peek());
    }
}