import java.io.*;
    import java.util.*;

    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            for(int i = 1;i<=19;i++){
                for (int j=1;j<=19;j++){
                    if (j%2==0) {
                        System.out.println(i+ " * " + j + " = "+(j*i));
                    }else if (j==19){
                        System.out.println(i+ " * " + j + " = "+(j*i));
                    } else {
                        System.out.print(i+ " * " + j + " = "+(j*i)+" / ");
                    }
                }
            }
        }
    }