import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine());
        int d = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int t =0;
        boolean k= true;
        if (d==11){
            if (h <11){
                System.out.println(-1);
                k = false;
            } else if (h==11){
                if (m<11){
                    System.out.println(-1);
                    k = false;
                } else if (m==11) {
                    System.out.println(0);
                    k = false;
                }else {
                    System.out.println(m-11);
                    k = false;
                }
            }else {
                t+=(h-11)*60;
                if (m<11){
                    t-=11-m;
                }else {
                    t+= m -11;
                }
            }
        }else{
            t+= (d-11)*1440;
            if (h<11){
                t-=(11-h)*60;
                if (m<11){
                    t-=11-m;
                }else {
                    t+= m -11;
                }
            }else {
                t+=(h-11)*60;
                if (m<11){
                    t-=11-m;
                }else {
                    t+= m -11;
                }
            }
        }
        if (k) {
            System.out.print(t);
        }
    }
}