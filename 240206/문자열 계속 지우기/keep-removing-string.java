import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arr =new ArrayList<>();
        String s= br.readLine();
        String s1 = br.readLine();
        for (int i=0;i<s.length();i++){
            arr.add(String.valueOf(s.charAt(i)));
        }
        while (true){
            if (s.contains(s1)) {
                s= s.replace(s1, "");
            }else {
                break;
            }
        }
        System.out.println(s);
    }
}