import java.util.*;
import java.io.*;

public class Main {
    public static boolean num(int n){
        if (n%4==0&&n%100==0&&n%400==0){
            return true;
        } else if (n%4==0&&n%100==0) {
            return  false;
        } else if (n%4==0) {
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int y = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        if (num(y)){
            if (a ==2){
                if (b<30){
                    System.out.println("Winter");
                }else {
                    System.out.println("-1");
                }
            } else if (a<8&&a%2==0){
                if (a>3){
                    if (b<31){
                        System.out.println("Spring");
                    }else {
                        System.out.println("-1");
                    }
                }
            } else if (a<=7&&a%2==1) {
                if (a==7){
                    if (b<32){
                        System.out.println("Summer");
                    }else {
                        System.out.println("-1");
                    }
                }else{
                    if (b<32){
                        System.out.println("Spring");
                    }else {
                        System.out.println("-1");
                    }
                }
            } else if (a>=8&&a%2==0&&a<13) {
                if (a<11) {
                    if (b < 32) {
                        System.out.println("Fall");
                    } else {
                        System.out.println("-1");
                    }
                }else {
                    if (b < 32) {
                        System.out.println("Winter");
                    } else {
                        System.out.println("-1");
                    }
                }
            } else if (a>7&&a%2==1&&a<13) {
                if (b<31){
                    System.out.println("Fall");
                }else {
                    System.out.println("-1");
                }
            } else {
                System.out.println("-1");
            }
        }else {
            if (a ==2){
                if (b<29){
                    System.out.println("Winter");
                }else {
                    System.out.println("-1");
                }
            } else if (a<8&&a%2==0){
                if (a>3){
                    if (b<31){
                        System.out.println("Spring");
                    }else {
                        System.out.println("-1");
                    }
                }
            } else if (a<=7&&a%2==1) {
                if (a==7){
                    if (b<32){
                        System.out.println("Summer");
                    }else {
                        System.out.println("-1");
                    }
                }else{
                    if (b<32){
                        System.out.println("Spring");
                    }else {
                        System.out.println("-1");
                    }
                }
            } else if (a>=8&&a%2==0&&a<13) {
                if (a<11) {
                    if (b < 32) {
                        System.out.println("Fall");
                    } else {
                        System.out.println("-1");
                    }
                }else {
                    if (b < 32) {
                        System.out.println("Winter");
                    } else {
                        System.out.println("-1");
                    }
                }
            } else if (a>7&&a%2==1&&a<13) {
                if (b<31){
                    System.out.println("Fall");
                }else {
                    System.out.println("-1");
                }
            } else {
                System.out.println("-1");
            }
        }
    }
}