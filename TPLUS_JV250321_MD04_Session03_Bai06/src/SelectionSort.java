import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap kich thuoc cua mang: ");
        int n = Integer.parseInt(sc.nextLine());

        System.out.println("Nhap cac phan tu cho mang:");
        int[] intArr = new int[n];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = Integer.parseInt(sc.nextLine());
        }

        System.out.print("Mang ban dau: ");
        System.out.println(Arrays.toString(intArr));

        System.out.print("Nhap so can tim: ");
        int number = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < intArr.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < intArr.length; j++) {
                if (intArr[j] > intArr[maxIndex]) {
                    maxIndex = j;
                }
            }
            if (maxIndex != i) {
                int temp = intArr[i];
                intArr[i] = intArr[maxIndex];
                intArr[maxIndex] = temp;
            }
        }

        System.out.print("Mang sau khi sap xep theo thu tu giam dan: ");
        System.out.println(Arrays.toString(intArr));

        //        Tim kiem tuyen tinh
        int linearSearchIndex = -1;
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] == number) {
                linearSearchIndex = i;
                break;
            }
        }
        if (linearSearchIndex != -1) {
            System.out.printf("Tim kiem tuyen tinh: Phan tu %d tim thay tai chi so: %d\n", number, linearSearchIndex);
        } else {
            System.out.printf("Tim kiem tuyen tinh: Khong tim thay phan tu %d trong mang\n", number);
        }

        //        Tim kiem nhi phan
        int left = 0;
        int right = intArr.length - 1;
        boolean found = false;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (intArr[middle] == number) {
                System.out.printf("Tim kiem nhi phan: Phan tu %d tim thay tai chi so: %d\n", number, middle);
                found = true;
                break;
            } else if (intArr[middle] < number) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        if (!found) {
            System.out.printf("Tim kiem nhi phan: Khong tim thay phan tu %d trong mang\n", number);
        }
    }
}
