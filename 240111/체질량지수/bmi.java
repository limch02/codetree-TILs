import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Vector;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        double a1 = (double) a /100;
        int b=  Integer.parseInt(st.nextToken());
        int c = (int) (b/(a1*a1));
        if (c>25){
            System.out.println(c+"\nObesity");
        }else {
            System.out.println(c);
        }
    }
}