import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int a = Integer.parseInt(br.readLine());
        if (a%4==0){
            if (a%100==0){
                if (a%400==0){
                    sb.append("True");
                }else {
                    sb.append("False");
                }
            }else {
                sb.append("Ture");
            }
        }else {
            sb.append("False");
        }
        System.out.println(sb);
    }
}