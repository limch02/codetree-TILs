import java.io.*;
    import java.util.*;

    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            if (n == m){
                for (int i = 2;i<=8;i+=2){
                    System.out.println(n + " * " + i + " = " + i * n);
                }
            }else {
                for (int i = 2; i <= 8; i+=2) {
                    for (int j = m; j >= n; j--) {
                        if (j != n) {
                            System.out.print(j + " * " + i + " = " + i * j + " / ");
                        } else {
                            System.out.print(j + " * " + i + " = " + i * j);
                        }
                    }
                    System.out.println();
                }
            }
        }
    }