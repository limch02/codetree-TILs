import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        char c1 = st.nextToken().charAt(0);
        char c2 = st.nextToken().charAt(0);
        if ((int)c1>(int)c2){
            System.out.println(((int)c1+(int)c2)+" "+((int)c1-(int)c2));
        }else {
            System.out.println(((int)c2+(int)c1)+" "+((int)c2-(int)c1));
        }
    }
}