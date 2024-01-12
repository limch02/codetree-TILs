import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        if (a>=3000){
            System.out.println("book");
        }else if(a>=1000){
            System.out.println("mask");
        }else{
            System.out.println("no");
        }
    }
}