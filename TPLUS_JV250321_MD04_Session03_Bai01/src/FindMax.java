import java.util.Arrays;
import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang:");
        int number = Integer.parseInt(sc.nextLine());
        int[] intsArr = new int[number];
        System.out.println("Nhap gia tri cac phan tu:");
        for (int i = 0; i < number; i++) {
            intsArr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(intsArr));

        for (int i = 0; i < intsArr.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < intsArr.length; j++) {
                if (intsArr[j] > intsArr[maxIndex]) {
                    maxIndex = j;
                }
            }
            if(i != maxIndex){
                int temp = intsArr[maxIndex];
                intsArr[maxIndex] = intsArr[i];
                intsArr[i] = temp;
            }
        }
        System.out.println("Mang sau khi sap xep theo thu tu giam dan: " + Arrays.toString(intsArr));
        System.out.println("Phan tu lon nhat trong mang la: " + intsArr[0]);
    }
}
