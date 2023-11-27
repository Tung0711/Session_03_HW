package Session_3_TH;

import java.util.Scanner;

public class B2_TH {
    public static void main(String[] args) {
        int n = 1, sum = 0;
        Scanner scanner = new Scanner(System.in);

        //Nhap vao cac so va tinh tong cac so le, ket thuc khi n = 0
        while (n != 0) {
            System.out.println("Nhập vào số nguyên n:");
            n = scanner.nextInt();
            if (n % 2 != 0) {
                sum += n;
            }
        }
        System.out.println("Tong cac so vua nhap:" + sum);
    }
}
