import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int[][] matrix = generateMatrix(rows, cols);

        // 생성된 행렬 출력
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] generateMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        int value = 1;
        int top = 0, bottom = rows - 1, left = 0, right = cols - 1;

        while (value <= rows * cols) {
            // 위쪽 행
            for (int i = left; i <= right && value <= rows * cols; i++) {
                matrix[top][i] = value++;
            }
            top++;

            // 오른쪽 열
            for (int i = top; i <= bottom && value <= rows * cols; i++) {
                matrix[i][right] = value++;
            }
            right--;

            // 아래쪽 행
            for (int i = right; i >= left && value <= rows * cols; i--) {
                matrix[bottom][i] = value++;
            }
            bottom--;

            // 왼쪽 열
            for (int i = bottom; i >= top && value <= rows * cols; i--) {
                matrix[i][left] = value++;
            }
            left++;
        }
        return matrix;
    }
}