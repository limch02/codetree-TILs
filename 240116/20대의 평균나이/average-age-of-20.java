import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double k = 0;
        double sum=0;
        while (true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            if (a>=30){
                if (k==0){
                    System.out.printf("%.2f",0.00);
                    break;
                }else {
                    System.out.printf("%.2f", sum / k);
                    break;
                }
            }
            sum+=a;
            k++;
        }
    }
}