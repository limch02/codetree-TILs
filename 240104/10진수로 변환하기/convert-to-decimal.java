import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] binary = br.readLine().split("");
        int num = 0;

        for(int i = 0; i < binary.length; i++)
            num = num * 2 + Integer.parseInt(binary[i]);

        System.out.print(num);
    }
}