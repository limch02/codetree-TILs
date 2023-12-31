import java.util.*;
import java.io.*;
public class Main {
    static class problem implements Comparable<problem>{
        String student;
        int a,b,c;
        problem(String student,int a,int b,int c){
            this.student = student;
            this.a = a;
            this.b = b;
            this.c = c;
        }
        @Override
        public int compareTo(problem o) {
            return (this.a+this.b+this.c)-(o.a+o.b+o.c);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        problem [] p = new problem[a];
        for (int i =0;i<a;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            int h = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            p[i] = new problem(s,h,k,c);
        }
        Arrays.sort(p);
        for (int i = 0;i<a;i++){
            System.out.println(p[i].student+" "+p[i].a+" "+p[i].b+" "+p[i].c);
        }
    }
}