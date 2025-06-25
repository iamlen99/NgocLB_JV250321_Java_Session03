import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap kich thuoc cua ma tran vuong: ");
        int n = Integer.parseInt(sc.nextLine());
        if (n <= 0) {
            System.out.println("Ma tran khong hop le");
            return;
        }
        int[][] matrix = new int[n][n];
        System.out.println("Nhap cac phan tu cua ma tran theo hang: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("Hang thu %d: ", i+1);
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Ma tran ban dau: " + Arrays.deepToString(matrix));

            int [][] rotatedMatrix = new int [n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotatedMatrix[i][j] = matrix[n - 1 - j][i];
            }
        }

        System.out.println("Ma tran sau khi xoay phai 90 do: " + Arrays.deepToString(rotatedMatrix));
    }
}
