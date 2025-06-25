import java.util.Arrays;
import java.util.Scanner;

public class findSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so hang: ");
        int row = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap so cot: ");
        int column = Integer.parseInt(sc.nextLine());

        int [][] intArray = new int [row][column];
        System.out.println("Nhap cac phan tu cho mang (theo tung hang):");
        for (int i = 0; i < intArray.length; i++) {
            System.out.printf("Hang %d: ", i+1);
            for (int j = 0; j < intArray[i].length; j++) {
                intArray[i][j] = sc.nextInt();
            }
        }

        System.out.print("Mang ban dau: ");
        System.out.println(Arrays.deepToString(intArray));

        int oddSum = 0;
        int evenSum = 0;
        for (int[] rows : intArray) {
            for (int elm : rows) {
                if (elm % 2 == 0) {
                    evenSum += elm;
                } else {
                    oddSum += elm;
                }
            }
        }
        System.out.println("Tong cac so chan la: " + evenSum);
        System.out.println("Tong cac so le la: " + oddSum);
    }
}
