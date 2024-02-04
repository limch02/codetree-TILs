import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String s = "";
        String k = "";
        if (a.contains("ee")) {
            s+="Yes";
        }else{
            s+= "No";
        }
        if (a.contains("ab")) {
            k+="Yes";
        }else{
            k+="No";
        }
        System.out.println(s+" "+k);
    }
}