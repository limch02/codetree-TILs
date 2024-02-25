import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i =0;i<a;i++){
            int b = Integer.parseInt(br.readLine());
            if (b==0){
                if (queue.isEmpty()){
                    System.out.println(0);
                }else {
                    System.out.println(queue.peek());
                    queue.poll();
                }
            }else {
                queue.add(b);
            }
        }
    }
}