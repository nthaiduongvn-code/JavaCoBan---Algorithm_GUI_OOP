package Study; // xem có phải chuỗi đối xứng không ví dụ radar ngược lại cũng là radar

import java.util.Scanner;

public class B26_11_panlyndrome {
    static void main() {
        String chuoi;
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhập vào 1 chuỗi: ");
        chuoi = sc.nextLine();
        String chuoi2= new StringBuilder(chuoi).reverse().toString();
        // code 11 có nghĩa: khởi tạo stringbuider mới và đảo ngược và chuyển sang string và ép vào biến chuoi2 có kiểu dữ liệu string
        // string mới so sánh với string được . code 14 15 là dạng đầy đủ nếu code 11 k có .reverce.tostring // Stringbuider chuoi2= new StringBuilder(chuoi) lưu ý stringbuider mới ép vào được stringbuider ép vào string sẽ lỗi
//        chuoi2.reverse();
//        String chuoi3= chuoi2.toString();
        if ( chuoi2.equals(chuoi)) System.out.println( chuoi+" là chuỗi đối xứng");
        else System.out.println( chuoi +" là chuỗi không đối xứng");
    }
}
