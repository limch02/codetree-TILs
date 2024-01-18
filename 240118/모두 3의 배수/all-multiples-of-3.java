import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean k = false;
        for (int i =0;i<5;i++){
            int a = Integer.parseInt(br.readLine());
            if (a%3!=0){
                k = true;
            }
        }
        if (k){
            System.out.println("0");
        }else {
            System.out.println("1");
        }
    }
}