package Study;
               /* write program chứa user name and password.
               chương trình yêu cầu nhập vào username and password
               nếu username không có program báo username không tồn tại
               nếu username đúng mà password sai thì báo pass sai
               nếu user và pass đúng đăng nhập thành công
                */

import java.util.HashMap;
import java.util.Scanner;

public class B29_2_hashmap {
    static void main() {

        // khởi tạo hashmap
        HashMap <String, String> login= new HashMap<>();

        // thêm vào hashmap
        login.put("Thái Dương", "123456");
        login.put("Tấn bắp", "54321");
        login.put("Huỳnh Trường", "12345");


        // nhập tên và pass
        Scanner sc = new Scanner(System.in);
        System.out.print( " nhập tên tài khoảng: ");
        String ten = sc.nextLine();
        System.out.print(" nhập pass: ");
        String pass = sc.nextLine();


        //kiểm tra
        if (!login.containsKey(ten))
            System.out.println( "tên tài khoản không tồn tại");
        else if (!login.get(ten).equals(pass))
            System.out.println(" pass sai rồi");
        else
            System.out.println(" đăng nhập thành công");

    }
}
