import javax.swing.*;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        if (a>=90){
            bw.write("A");
        } else if (a>=80&&a<90) {
            bw.write("B");
        } else if (a>=70&&a<80){
            bw.write("C");
        }else if(a>=60&&a<70){
            bw.write("D");
        }else{
            bw.write("F")
        }
        bw.close();
    }
}