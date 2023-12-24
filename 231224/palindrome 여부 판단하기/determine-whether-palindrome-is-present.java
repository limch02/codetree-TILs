import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        boolean k = true;
        for (int i =0;i<s.length()/2;i++){
            if (s.charAt(i)!=s.charAt(s.length()-1-i)){
                System.out.println("No");
                k = false;
                break;
            }
        }
        if (k){
            System.out.println("Yes");
        }
    }
}