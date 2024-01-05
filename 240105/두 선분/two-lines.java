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
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        if (a<c){
            if (b>c){
                System.out.println("intersecting");
            }else {
                System.out.println("nonintersecting");
            }
        }else{
            if (d>a){
                System.out.println("intersecting");
            }else {
                System.out.println("nonintersecting");
            }
        }
    }

}