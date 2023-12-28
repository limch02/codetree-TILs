import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        String[] words = new String[a];
        for (int i =0;i<a;i++){
            words[i] = br.readLine();
        }
        Arrays.sort(words);
        for (int i =0;i<a;i++){
            System.out.println(words[i]);
        }
    }
}