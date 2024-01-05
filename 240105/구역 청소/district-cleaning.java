import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        StringTokenizer s = new StringTokenizer(br.readLine());
        int c = Integer.parseInt(s.nextToken());
        int d = Integer.parseInt(s.nextToken());
        if (a==c){
            if (b<d){
                System.out.println(d-a);
            }else {
                System.out.println(b-a);
            }
        } else if(a<c){
            if (b>d) {
                System.out.println(b-a);
            } else if (b==c){
                System.out.println(d-a);
            } else if (b<c) {
                System.out.println((b-a)+(d-c));
            } else{
                System.out.println(d-a);
            }
        }else{
            if (b<d){
                System.out.println(d-c);
            } else if (d==a){
                System.out.println(b-c);
            } else if (d<a) {
                System.out.println((b-a)+(d-c));
            } else{
                System.out.println(b-c);
            }
        }
    }

}