import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        String s2 = br.readLine();
        String num1 = "";
        String num2 = "";
        for (int i =0;i<s1.length();i++){
            int a = s1.charAt(i);
            if (a>=97&&a<=122){

            }else if (a>=65&&a<=90){

            }else {
                num1 += String.valueOf(s1.charAt(i));
            }
        }for (int i =0;i<s2.length();i++){
            int a = s2.charAt(i);
            if (a>=97&&a<=122){

            }else if (a>=65&&a<=90){

            }else {
                num2 += String.valueOf(s2.charAt(i));
            }

        }
        System.out.println(Integer.parseInt(num1)+Integer.parseInt(num2));
    }
}