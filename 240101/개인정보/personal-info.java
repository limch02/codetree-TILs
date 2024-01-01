import java.util.*;
import java.io.*;

public class Main {
    static class Problem implements Comparable<Problem> {
        String name;
        int a;
        double b;

        Problem(String name, int a, double b) {
            this.name = name;
            this.a = a;
            this.b = b;
        }

        @Override
        public int compareTo(Problem o) {
            return this.name.compareTo(o.name);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Problem[] p = new Problem[5];

        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            int a = Integer.parseInt(st.nextToken());
            double k = Double.parseDouble(st.nextToken());
            p[i] = new Problem(s, a, k);
        }

        Arrays.sort(p);

        System.out.println("name");
        for (int i = 0; i < 5; i++) {
            System.out.println(p[i].name + " " + p[i].a + " " + p[i].b);
        }
        System.out.println();
        Arrays.sort(p, new Comparator<Problem>() {
            @Override
            public int compare(Problem o1, Problem o2) {
                return o2.a - o1.a; // Compare by height in descending order
            }
        });

        System.out.println("height");
        for (int i = 0; i < 5; i++) {
            System.out.println(p[i].name + " " + p[i].a + " " + p[i].b);
        }
    }
}