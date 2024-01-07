import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        if (a ==0){
            if (b>=19){
                sb.append("MAN");
            }else {
                sb.append("BOY");
            }
        }else {
            if (b>=19){
                sb.append("WOMAN");
            }else {
                sb.append("GIRL");
            }
        }
        System.out.println(sb);
    }
}