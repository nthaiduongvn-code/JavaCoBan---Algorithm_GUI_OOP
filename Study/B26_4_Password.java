package Study; // kiểm tra mật khẩu hợp lệ

import java.util.Scanner;

public class B26_4_Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int y = 5;
        int x = 1;
        String mk;

        while (x <= y) {
            // Thông báo khác nhau cho lần đầu và các lần sau
            if (x == 1) {
                System.out.print("Nhập mật khẩu: ");
            } else {
                System.out.print("Vui lòng nhập lại mật khẩu lần " + x+ ": ");
            }
            mk = sc.nextLine();

            // Kiểm tra các điều kiện
            boolean lengthOk = mk.length() >= 6;
            boolean hasDigit = false;
            boolean hasLower = false;
            boolean hasUpper = false;
            boolean hasSpecial = false;
            boolean hasWhitespace = false;

            for (int i = 0; i < mk.length(); i++) {
                char c = mk.charAt(i);
                if (Character.isDigit(c)) {
                    hasDigit = true;
                } else if (Character.isLowerCase(c)) {
                    hasLower = true;
                } else if (Character.isUpperCase(c)) {
                    hasUpper = true;
                } else if (Character.isWhitespace(c)) {
                    hasWhitespace = true;
                } else {
                    // ký tự không phải chữ, không phải số, không phải whitespace => coi là đặc biệt
                    hasSpecial = true;
                }
            }

            // Kiểm tra tổng hợp và in lý do (nếu có)
            if (!lengthOk) {
                System.out.println("❌Mật khẩu phải có ít nhất 6 ký tự.");
            } else if (hasWhitespace) {
                System.out.println("❌Mật khẩu không được chứa khoảng trắng.");
            } else if (!hasUpper || !hasLower || !hasDigit || !hasSpecial) {
                System.out.println("❌Mật khẩu phải chứa ít nhất: 1 chữ hoa, 1 chữ thường, 1 chữ số và 1 ký tự đặc biệt.");
            } else {
                // Nếu tất cả điều kiện thỏa
                System.out.println("✅ Mật khẩu hợp lệ!");
                sc.close();
                return; // thoát chương trình
            }

            // nếu đến đây là sai, tăng attempt và kiểm tra xem còn lượt không
            x++;
            if (x > y) {
                System.out.println("❌ Bạn đã nhập sai quá " + y + " lần. Chương trình kết thúc.");
            }
        }
    }
}
