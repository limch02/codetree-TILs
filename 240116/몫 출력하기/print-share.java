import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = 0;
        while (true){
            int a = Integer.parseInt(br.readLine());
            if (a%2==0){
                System.out.println(a/2);
                k++;
            }
            if(k==3){
                break;
            }
        }
    }
}