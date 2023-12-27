import java.util.*;
import java.io.*;

public class Main {
    static int cnt =0;
    public static int sum(int n){
        if (n ==1){
            return cnt;
        }
        cnt++;
        if (n%2==0){

            return sum(n/2);
        }else {

            return sum(n/3);
        }
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        System.out.println(sum(a));
    }

}