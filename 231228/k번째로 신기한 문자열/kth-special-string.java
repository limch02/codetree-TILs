import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        String s = st.nextToken();
        ArrayList<String> arr = new ArrayList<>();
        for (int i =0;i<a;i++){
            String s1 = br.readLine();
            boolean b1 = true;
            for (int j=0;j<s.length();j++){
                if (s.charAt(j)!=s1.charAt(j)){
                    b1 = false;
                }
            }
            if (b1) {
                arr.add(s1);
            }
        }
        Collections.sort(arr);
        System.out.print(arr.get(b-1));
    }
}