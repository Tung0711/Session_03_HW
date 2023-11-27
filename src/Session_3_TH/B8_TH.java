package Session_3_TH;

import java.util.Arrays;
import java.util.Scanner;

public class B8_TH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Nhập vào một số nguyên n:");
        n = scanner.nextInt();

        do {
            System.out.println("********** PRACTICE **********");
            System.out.println("1. In dãy số chia hết cho 2 và giảm dần");
            System.out.println("2. In các số nhỏ hơn n và tính tổng");
            System.out.println("3. In ra các ước số chẵn của n");
            System.out.println("4. In ra các ước số lẻ và số lượng các ước lẻ của n");
            System.out.println("5. In ra các ước lẻ lớn nhất của n");
            System.out.println("6. Thoát");
            System.out.println("Lựa chọn của bạn: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    for (int i = n; i >= 2; i--) {
                        if (i % 2 == 0) {
                            System.out.print(i + " ");
                        }
                    }
                    System.out.println();
                    break;
                case 2:
                    int sum = 0;
                    for (int i = 0; i < n; i++) {
                        System.out.print(i + " ");
                        sum += i;
                    }
                    System.out.println("\nTổng =" + sum);
                    break;
                case 3:
                    System.out.printf("Các ước số chẵn của %d là ", n);
                    for (int i = 1; i <= n; i++) {
                        if (n % i == 0 && n % 2 == 0) {
                            System.out.print(i + " ");
                        }
                    }
                    System.out.println();
                    break;
                case 4:
                    int k = 0;
                    System.out.printf("Các ước số lẻ của %d là \n", n);
                    for (int i = 1; i <= n; i++) {
                        if (n % i == 0 && n % 2 != 0) {
                            System.out.print(i + " ");
                            k++;
                        }
                    }
                    System.out.println("\nSố lượng các ước lẻ là: " + k);
                    break;
                case 5:
                    int big = 1;
                    for (int i = 1; i <= n; i++) {
                        if (n % i == 0 && n % 2 != 0) {
                            big = i;
                        }
                    }
                    System.out.printf("Ước số lẻ lớn nhất của %d là: %d\n", n, big);
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không phù hợp. Vui lòng nhập lại!");
            }

        } while (true);
    }
}
