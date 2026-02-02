package Study;
import java.util.Scanner;

public class B13_swichcase {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print(" nhập tháng cần tính số ngày: ");
        while (true) {
            int t = sc.nextInt();
            if (t >= 1 && t <= 12) {
                switch (t) {
                    case 1: case 3:
                    case 5: case 7: case 8: case 10: case 12:
                        System.out.println(" tháng " + t + " là tháng có 31 ngày");
                        break;
                    case 4: case 6:
                    case 9:
                    case 11:
                        System.out.println(" tháng " + t + " là tháng có 30 ngày");
                        break;

                } break;
            } else System.out.print(" ---tháng không hợp lệ--- " + " \n Vui lòng nhập lại tháng cần tính: ");

        }
    }
}