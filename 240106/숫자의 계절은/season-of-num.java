import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int a = Integer.parseInt(br.readLine());
        if (a>=3>&&a<=5){
            sb.append("Spring");
        } else if (a>=6>&&a<=8) {
            sb.append("Summer");
        }else if(a>=9>&&a<=11){
            sb.append("Fall");
        } else{
            sb.append("Winter")
        }
        System.out.println(sb);
    }
}