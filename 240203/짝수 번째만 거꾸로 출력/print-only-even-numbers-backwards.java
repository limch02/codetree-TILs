import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws  IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        for (int i = s.length()-1;i>=0;i--){
            if (i%2==1){
                System.out.print(s.charAt(i));
            }
        }
    }
}