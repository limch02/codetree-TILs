import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arr =new ArrayList<>();
        String s= br.readLine();
        for (int i=0;i<s.length();i++){
            arr.add(String.valueOf(s.charAt(i)));
        }
        while (true){
            int a = Integer.parseInt(br.readLine());
            if (a>=(arr.size()-1)){
                arr.remove(arr.size()-1);
            }else {
                arr.remove(a);
            }
            for (int i =0;i<arr.size();i++){
                System.out.print(arr.get(i));
            }
            System.out.println();
            if (arr.size()==1){
                break;
            }
        }
    }
}