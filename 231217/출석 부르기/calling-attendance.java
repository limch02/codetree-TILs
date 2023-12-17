import javax.swing.*;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        if (a==1){
            bw.write("John");
        } else if (a==2) {
            bw.write("Tom");
        } else if (a==3){
            bw.write("paul");
        }else {
            bw.write("Vacancy");
        }
        bw.close();
    }
}