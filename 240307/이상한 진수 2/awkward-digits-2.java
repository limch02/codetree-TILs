import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        boolean t = true;
        int cnt = 0;
        int sum = 0;
        for (int i =0;i<s.length();i++){
            if (s.charAt(i)-'0'==0){
                t = false;
                if (cnt ==0){
                    sum += (int)Math.pow(2,s.length()-1-i);
                }
                cnt++;
            } else {
                sum += (int)Math.pow(2,s.length()-1-i);
            }
        }
        if (t){
            System.out.println(sum-1);
        }else {
            System.out.println(sum);
        }
    }
}