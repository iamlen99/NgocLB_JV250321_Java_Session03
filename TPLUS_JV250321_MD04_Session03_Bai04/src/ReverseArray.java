import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap kich thuoc cua mang");
        int n = Integer.parseInt(sc.nextLine());
        if (n == 0) {
            System.out.println("Kich thuoc rong");
            return;
        }

        int[] intArr = new int[n];
        System.out.println("Nhap cac phan tu cho mang");
        for (int i = 0; i < n; i++) {
            intArr[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.print("Mang ban dau: ");
        System.out.println(Arrays.toString(intArr));

        for (int i = 0; i < intArr.length / 2; i++) {
            int temp = intArr[i];
            intArr[i] = intArr[intArr.length - i - 1];
            intArr[intArr.length - i - 1] = temp;
        }

        System.out.print("Mang sau khi dao nguoc: ");
        System.out.println(Arrays.toString(intArr));
    }
}
