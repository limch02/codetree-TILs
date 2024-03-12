import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int max = -1;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n; k++){
                    int[] num = new int[5];
                    int index = 4;
                    int sum = arr[i] + arr[j] + arr[k];
                    int a = arr[i];
                    int b = arr[j];
                    int c = arr[k];
                    while(index >= 0){
                        num[index] += a % 10;
                        a /= 10;
                        num[index] += b % 10;
                        b /= 10;
                        num[index] += c % 10;
                        c /= 10;
                        if(num[index] > 9) break;
                        index--;
                    }
                    if(index == -1 && num[++index] < 10)
                        max = Math.max(sum, max);
                }
            }
        }
        System.out.print(max);
    }
}