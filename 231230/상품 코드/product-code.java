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
        StringTokenizer st = new StringTokenizer(br.readLine());
        String name = st.nextToken();
        int l = Integer.parseInt(st.nextToken());
        lv vv = new lv("codetree", 50);
        lv ss = new lv(name, l);
        System.out.println("product " + vv.lv + " is "+vv.name);
        System.out.println("product " + ss.lv + " is "+ss.name);
    }
}