import java.util.*;
import java.io.*;
public class Main {
    static class spy{
        String code, place;
        int time;
        public spy(String code,String place,int time){
            this.code= code;
            this.place= place;
            this.time = time;
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String c = st.nextToken();
        String p = st.nextToken();
        int t = Integer.parseInt(st.nextToken());
        spy s = new spy(c,p,t);
        System.out.println("secret code : "+s.code);
        System.out.println("meeting point : "+s.place);
        System.out.println("time : "+s.time);
    }
}