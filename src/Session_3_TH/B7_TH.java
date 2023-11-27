package Session_3_TH;

import java.util.Scanner;

public class B7_TH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        System.out.println("Nhập vào số thứ nhất:");
        a = scanner.nextInt();
        System.out.println("Nhập vào số thứ hai:");
        b = scanner.nextInt();
        System.out.println("Nhập vào số thứ ba:");
        c = scanner.nextInt();

        do {
            System.out.println("************ CACULATOR ************");
            System.out.println("1. Tổng ba số nguyên");
            System.out.println("2. Trung bình cộng của ba số nguyên");
            System.out.println("3. Số lớn nhất, nhỏ nhất trong ba số");
            System.out.println("4. Thoát");
            System.out.println("Lựa chọn của bạn:");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.printf("Tổng của 3 số nguyên là: %d\n", (a + b + c));
                    break;
                case 2:
                    System.out.printf("Trung bình cộng của ba số là: %d\n", ((a + b + c) / 3));
                    break;
                case 3:
                    int max = Math.max(a, Math.max(b, c));
                    int min = Math.min(a, Math.min(b, c));
                    System.out.printf("%d là số lớn nhất\n", max);
                    System.out.printf("%d là số nhỏ nhất\n", min);
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không phù hợp. Vui lòng nhập lại!");
            }
        } while (true);
    }
}
