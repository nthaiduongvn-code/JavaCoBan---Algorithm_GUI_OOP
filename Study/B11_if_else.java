package Study;

import java.util.Scanner;

public class B11_if_else {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print(" nhập điểm của thí sinh: ");
        Float a = sc.nextFloat();
        if (a>=0 && a<=10) {
            if (a <= 5)
                System.out.println(a + " là điểm trung bình");
            else if (a > 5 && a < 8)
                System.out.println(a + " là điểm khá ");
            else
                System.out.println(a + " là điểm giỏi");
        }
        else
            System.out.println( " điểm không hợp lệ");
    }
}
