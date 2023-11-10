import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        LinkedList<Integer> l = new LinkedList<>(); // 정수를 관리할 list를 선언합니다. => 빈 이중연결리스트
        for (int i =0;i<a;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            switch (s){
                case "push_front": l.addFirst(Integer.parseInt(st.nextToken()));  break;
                case "push_back": l.addLast(Integer.parseInt(st.nextToken()));break;
                case "pop_front": System.out.println(l.peekFirst()); l.pollFirst();break;
                case "pop_back": System.out.println(l.peekLast()); l.pollLast();break;
                case "size": System.out.println(l.size()); break;
                case "empty": if (l.isEmpty()) System.out.println(1);else System.out.println(0);break;
                case "front": System.out.println(l.peekFirst()); break;
                case "back": System.out.println(l.peekLast());break;
            }
        }
    }
}