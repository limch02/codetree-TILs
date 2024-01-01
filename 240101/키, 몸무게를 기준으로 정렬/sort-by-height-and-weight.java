import java.util.*;
import java.io.*;

public class Main {
    static class Problem implements Comparable<Problem> {
        String name;
        int a, b;

        Problem(String name, int a, int b) {
            this.name = name;
            this.a = a;
            this.b = b;
        }

        @Override
        public int compareTo(Problem o) {
            if (this.a == o.a){
                return o.b-this.b;
            }else {
                return this.a-o.a;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        Problem[] p = new Problem[a];
        for (int i = 0; i < a; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            int h = Integer.parseInt(st.nextToken());
            int  k = Integer.parseInt(st.nextToken());
            p[i] = new Problem(s, h, k);
        }
        Arrays.sort(p);
        for (int i = 0; i < a; i++) {
            System.out.println(p[i].name + " " + p[i].a + " " + p[i].b);
        }
    }
}