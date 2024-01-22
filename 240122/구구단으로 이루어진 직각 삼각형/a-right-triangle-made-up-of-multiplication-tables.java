import java.io.*;
    import java.util.*;

    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st= new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            for (int i = 1;i<=a;i++){
                for (int j =1;j<=a-i+1;j++){
                    if (j==a-i+1){
                        System.out.print(i+" * "+j+" = "+(i*j));
                    }else {
                        System.out.print(i + " * " + j + " = " + (i * j) + " / ");
                    }
                }
                System.out.println();
            }
        }
    }