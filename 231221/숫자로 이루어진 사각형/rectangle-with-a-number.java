import java.util.*;
public class Main {
    public static void print5Stars(int n) {
        int k =1;
        for (int i =0;i<n;i++){
            for (int j=1;j<=n;j++){
                System.out.print(k);
                if (k==9){
                    k=0;
                }
                k++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        print5Stars(a);
    }
}