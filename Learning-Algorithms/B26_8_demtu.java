package Study; // đếm từ trong chuỗi

import java.util.Scanner;

public class B26_8_demtu {
    static void main() {
        String chuoi = " tôi sẽ cố gắng, tôi sẽ thành công, tôi sẽ hoàn thành đời người";
        String[] mang = chuoi.split(" ");
        int dem=0;
        for (String phantu : mang) {
            System.out.println(phantu);
            if (phantu.equals("tôi")) dem++;
        }
        System.out.println(" số chữ tôi trong chuỗi là: "+ dem);
    }

    public static class B26_4_password {
        public static boolean whileSpace(String mk) {
            for (int i = 0; i < mk.length(); i++) {
                if (Character.isWhitespace(mk.charAt(i)))
                    return true;
            }   // hàm này viết gọn không hiểu xem các hàm dưới
            return false;
        }

        public static boolean lowerCase(String mk) {
            boolean lowewcase = false;
            for (int i = 0; i < mk.length(); i++) {
                char kt = mk.charAt(i);
                if (Character.isLowerCase(kt))
                    lowewcase = true;
            }
            return lowewcase;
        }

        public static boolean upperCase(String mk) {
            boolean uppercase = false;
            for (int i = 0; i < mk.length(); i++) {
                char kt = mk.charAt(i);
                if (Character.isUpperCase(kt))
                    uppercase = true;
            }
            return uppercase;
        }

        public static boolean diGit(String mk) {
            boolean digit = false;
            for (int i = 0; i < mk.length(); i++) {
                char kt = mk.charAt(i);
                if (Character.isDigit(kt))
                    digit = true;
            }
            return digit;
        }

        public static void main(String[] args) {
            System.out.println(" Thiết lập mật khẩu: ");
            Scanner sc = new Scanner(System.in);
            String password = "";
            while (true) {
                String mk = sc.nextLine();
                if (!whileSpace(mk)) {
                    if (lowerCase(mk) && upperCase(mk) && diGit(mk)) {
                        System.out.println(" Mật khẩu đã được thiết lập✅");
                        password = mk;
                    }
                    else {
                        System.out.println(" mật khẩu phải chứa chữ số, chữ cái hoa và thường ");
                        System.out.print(" thiết lập lại mật khẩu: ");
                        continue;
                    }
                    break;
                } else {
                    System.out.println("❌mật khẩu không được chứa khoảng trắng❌");
                    System.out.print(" thiết lập lại mật khẩu: ");
                continue;
                }

            }
            int d=1;
            while (d<=5){

                if ( d==1) {
                    System.out.println(" Nhập mật khẩu đăng nhập: ");
                    String mk1 = sc.nextLine();
                    d++;
                    if (mk1.equals(password)) {
                        System.out.println(" ✅Mật khẩu trùng khớp");
                        break;
                    }
                    else
                        continue;
                }
                else {
                    System.out.println( " ---mật khẩu không trùng khớp---");
                    System.out.println( " thử lại mật khẩu lần "+ d);
                    String mk1 = sc.nextLine();
                    d++;
                    if (mk1.equals(password)) {
                        System.out.println(" ✅Mật khẩu trùng khớp");
                        d--;
                        break;
                    }
                    else
                        continue;
                }
            }
            if (d==6) System.out.println( " ❌BẠN ĐÃ NHẬP SAI QUÁ 5 LẦN \n ---CHƯƠNG TRÌNH KẾT THÚC---");
            sc.close();
        }

    }
}
