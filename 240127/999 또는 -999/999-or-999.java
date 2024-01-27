import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        while (true){
            int a =Integer.parseInt(st.nextToken());
            if (a==999||a==-999){
                break;
            }
            if (a>max){
                max =a;
            }
            if (min>a){
                min = a;
            }
        }
        System.out.println(max+" "+min);
    }
}