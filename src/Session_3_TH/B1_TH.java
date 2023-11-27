package Session_3_TH;

import java.util.Scanner;

public class B1_TH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, sum;
        System.out.println("Nhập vào n:");
        n = scanner.nextInt();

        //in ra các số chẵn từ 1 đến n
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.printf("%d\t", i);
            }
        }
    }
}
