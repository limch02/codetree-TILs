import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        double a = Double.parseDouble(st.nextToken());
        if (a>=1.0){
            System.out.println("High");
        }else if(a>0.5){
            System.out.println("Middle");
        }else{
            System.out.println("Low");
        }
    }
}