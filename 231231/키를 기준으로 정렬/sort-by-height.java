import java.util.*;
import java.io.*;
public class Main {
    static class problem implements Comparable<problem>{
        String student;
        int height, kilos;
        problem(String student,int height,int kilos){
            this.student = student;
            this.height = height;
            this.kilos = kilos;
        }
        @Override
        public int compareTo(problem o) {
            return this.height-o.height;
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
            p[i] = new problem(s,h,k);
        }
        Arrays.sort(p);
        for (int i = 0;i<a;i++){
            System.out.println(p[i].student+" "+p[i].height+" "+p[i].kilos);
        }
    }
}