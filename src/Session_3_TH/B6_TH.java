package Session_3_TH;

import java.util.Scanner;

public class B6_TH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        System.out.println("Nhập vào số thứ nhất: ");
        a = scanner.nextInt();
        System.out.println("Nhập vào số thứ hai: ");
        b = scanner.nextInt();

        do {
            System.out.println("************ CACULATOR ************");
            System.out.println("1. Tổng hai số");
            System.out.println("2. Hiệu hai số");
            System.out.println("3. Tích hai số");
            System.out.println("4. Thương hai số");
            System.out.println("5. Số dư trong phép chia 2 số");
            System.out.println("6. Ước chung lớn nhất");
            System.out.println("7. Bội chung nhỏ nhất");
            System.out.println("8. Thoát");
            System.out.println("************************************");
            System.out.println("Lựa chọn của bạn: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.printf("Tổng của %d và %d là: %d\n", a, b, (a + b));
                    break;
                case 2:
                    System.out.printf("Hiệu của %d và %d là: %d\n", a, b, (a - b));
                    break;
                case 3:
                    System.out.printf("Tích của %d và %d là: %d\n", a, b, (a * b));
                    break;
                case 4:
                    System.out.printf("Thương của %d và %d là: %d\n", a, b, (a / b));
                    break;
                case 5:
                    System.out.printf("Số dư tong phép chia %d và %d là %d\n", a, b, (a % b));
                    break;
                case 6:
                    int number1 = a, number2 = b;
                    while (number1 != number2) {
                        if (number1 > number2) {
                            number1 -= number2;
                        } else {
                            number2 -= number1;
                        }
                    }
                    System.out.printf("Ước chung lớn nhất của %d và %d là: %d\n", a, b, number1);
                    break;
                case 7:
                    int numberOne = a, numberTwo = b;
                    while (numberOne != numberTwo) {
                        if (numberOne > numberTwo) {
                            numberOne -= numberTwo;
                        } else {
                            numberOne -= numberTwo;
                        }
                    }
                    System.out.printf("Bội chung nhỏ nhất của %d và %d là: %d\n", a, b, (a * b) / numberOne);
                    break;
                case 8:
                    System.exit(0);
                default:
                    System.err.println("Lựa chọn của bạn không phù hợp. Vui lòng nhập lại!");
            }
        } while (true);
    }
}
