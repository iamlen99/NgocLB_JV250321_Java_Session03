import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicateValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap kich thuoc cua mang: ");
        int n = Integer.parseInt(sc.nextLine());
        if (n <= 0) {
            System.out.println("Mang khong hop le");
            return;
        }

        System.out.println("Nhap cac phan tu cho mang:");
        int[] intArr = new int[n];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = Integer.parseInt(sc.nextLine());
        }

        System.out.print("Mang ban dau: ");
        System.out.println(Arrays.toString(intArr));

        int count = 0;
        for (int i = 0; i < intArr.length; i++) {
            boolean duplicated = false;
            for (int j = 0; j < intArr.length; j++) {
                if (i != j && intArr[j] == intArr[i]) {
                    duplicated = true;
                    break;
                }
            }
            if (!duplicated) count++;
        }

        if (count == 0 ) {
            System.out.println("Khong co phan tu nao duy nhat trong mang");
            return;
        }

        int[] newArr = new int[count];
        count = 0;
        for (int i = 0; i < intArr.length; i++) {
            boolean duplicated = false;
            for (int j = 0; j < intArr.length; j++) {
                if (i != j && intArr[j] == intArr[i]) {
                    duplicated = true;
                    break;
                }
            }
            if (!duplicated) {
                count++;
                newArr[count - 1] = intArr[i];
            }
        }
        System.out.println("Mang sau khi loai bo cac phan tu trung lap la: " + Arrays.toString(newArr));
    }
}
