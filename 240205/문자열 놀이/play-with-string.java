import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        String s = st.nextToken();
        int a = Integer.parseInt(st.nextToken());
        for (int i = 0 ; i<a;i++){
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int b = Integer.parseInt(st1.nextToken());
            switch (b){
                case 1:
                    int c = Integer.parseInt(st1.nextToken());
                    int d = Integer.parseInt(st1.nextToken());
                    String s1 = "";
                    for (int j = 0;j<s.length();j++){
                        if (j==c-1){
                            s1+=String.valueOf(s.charAt(d-1));
                        } else if (j==d-1) {
                            s1+= String.valueOf(s.charAt(c-1));
                        }else {
                            s1+=String.valueOf(s.charAt(j));
                        }
                    }
                    s = s1;
                    System.out.println(s);
                    break;
                case 2:

                    String c1 = st1.nextToken();
                    String c2 = st1.nextToken();
                    String s2 = "";
                    for (int j = 0;j<s.length();j++){
                        if (c1.equals(String.valueOf(s.charAt(j)))){
                            s2 += c2;
                        }else {
                            s2 += String.valueOf(s.charAt(j));
                        }
                    }
                    s = s2;
                    System.out.println(s);
                    break;
            }
        }
    }
}