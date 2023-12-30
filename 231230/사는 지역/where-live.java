import java.util.*;
import java.io.*;
public class Main {
    static class lv{
        String name, place,lv;
        public lv(String name, String lv,String place){
            this.name = name;
            this.lv = lv;
            this.place = place;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        lv[] lvs = new lv[a];
        int j =0;
        int min = Integer.MAX_VALUE;
        for (int i =0;i<a;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String l = (st.nextToken());
            String p = st.nextToken();
            lvs[i] = new lv(name,l,p);
        }
        lv ss = lvs[a-1];
        System.out.println("name "+ss.name);
        System.out.println("addr "+ss.lv);
        System.out.println("city "+ss.place);

    }
}