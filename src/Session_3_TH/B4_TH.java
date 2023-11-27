package Session_3_TH;

import java.util.Scanner;

public class B4_TH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 1;

        while (n != 0) {
            System.out.println("Nhập vào số nguyên n:");
            n = scanner.nextInt();
            if (n % 3 == 0) {
                System.out.printf("%d là số chia hết cho 3\n", n);
            }
        }
    }
}
