import java.util.*;
import java.io.*;
public class Main {
    static class lv{
        String name;
        int lv;
        public lv(String name, int lv){
            this.name = name;
            this.lv = lv;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        lv[] lvs = new lv[5];
        int j =0;
        int min = Integer.MAX_VALUE;
        for (int i =0;i<5;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int l = Integer.parseInt(st.nextToken());
            if (l<min){
                min = l;
                j =i;
            }
            lvs[i] = new lv(name,l);
        }
        lv ss = lvs[j];
        System.out.println(ss.name+" "+ss.lv);

    }
}