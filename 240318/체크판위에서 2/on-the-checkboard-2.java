import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int count=0;
        char [][] arr = new char[r][c];
        for (int i=0;i<r;i++){
            StringTokenizer s = new StringTokenizer(br.readLine());
            for (int j =0;j<c;j++){
                arr[i][j] = s.nextToken().charAt(0);
            }
        }
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(arr[i][j] == 'B' && i != r-1 && j != c-1){
                    for(int k=i+1; k<r-1; k++){
                        for(int l=j+1; l<c-1; l++){
                            if(arr[k][l] == 'W')
                                count++;
                            if(arr[k+1][j+1] == 'B')
                                break;
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}