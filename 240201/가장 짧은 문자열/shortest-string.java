import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws  IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int min = Integer.MAX_VALUE;
        for (int i = 0;i<3;i++){
            String s = br.readLine();
            if (min > s.length()){
                min = s.length();
            }
        }
        System.out.println(min);
    }
}