import java.util.Arrays;
import java.util.Scanner;

public class FindSumInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang:");
        int n = Integer.parseInt(sc.nextLine());
        int[] intArr = new int[n];
        System.out.println("Nhap cac phan tu trong mang");
        for (int i = 0; i < n; i++) {
            intArr[i] = Integer.parseInt(sc.nextLine());
        }

        System.out.println(Arrays.toString(intArr));
        int sum = 0;
        for (int num : intArr) {
            sum += num;
        }
        System.out.println("Tong cac phan tu trong mang la: " + sum);
    }
}
