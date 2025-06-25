import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap kich thuoc cua mang");
        int n = Integer.parseInt(sc.nextLine());
        int[] intArr = new int[n];
        System.out.println("Nhap cac phan tu cho mang");
        for (int i = 0; i < n; i++) {
            intArr[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.print("Mang ban dau: ");
        System.out.println(Arrays.toString(intArr));

        for (int i = 0; i < intArr.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < intArr.length - 1 - i; j++) {
                if (intArr[j] < intArr[j + 1]) {
                    int temp = intArr[j];
                    intArr[j] = intArr[j + 1];
                    intArr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        System.out.print("Mang sau khi sap xep theo thu tu giam dan: ");
        System.out.println(Arrays.toString(intArr));
    }
}
