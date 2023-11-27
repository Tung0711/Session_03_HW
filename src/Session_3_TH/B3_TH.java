package Session_3_TH;

import java.util.Scanner;

public class B3_TH {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("******* Breakfast Menu *******");
            System.out.println("1. Phở tôm hùm");
            System.out.println("2. Phở bò Kobe");
            System.out.println("3. Phở gà Việt Nam");
            System.out.println("4. Xôi trứng thịt");
            System.out.println("5. Bánh mỳ trứng");
            System.out.println("6. Mỳ tôm không người lái");
            System.out.println("7. Thoát");
            System.out.println("*******************************");
            System.out.println("Lựa chọn của bạn: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Bạn vừa chọn món phở tôm hùm, vui lòng đợi trong giây lát");
                    break;
                case 2:
                    System.out.println("Bạn vừa chọn món phở bò Kobe, vui lòng đợi trong giây lát");
                    break;
                case 3:
                    System.out.println("Bạn vừa chọn món phở gà Việt Nam, vui lòng đợi trong giây lát");
                    break;
                case 4:
                    System.out.println("Bạn vừa chọn món xôi trứng thịt, vui lòng đợi trong giây lát");
                    break;
                case 5:
                    System.out.println("Bạn vừa chọn món bánh mỳ trứng, vui lòng đợi trong giây lát");
                    break;
                case 6:
                    System.out.println("Bạn vừa chọn món mỳ tôm không người lái, vui lòng đợi trong giây lát");
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.err.println("Lựa chọn không phù hợp. Vui lòng nhập lại");
            }
        } while (true);
    }
}
