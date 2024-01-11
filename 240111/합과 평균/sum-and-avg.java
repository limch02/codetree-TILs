import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Vector;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        Double a = Double.parseDouble(st.nextToken());
        Double b = Double.parseDouble(st.nextToken());
        String s = String.format("%.0f",(a+b));
        String d = String.format("%.1f",(a+b)/2);
        System.out.println(s+" "+d);
    }
}