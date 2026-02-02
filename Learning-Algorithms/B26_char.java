package Study;

import java.util.Scanner;

public class B26_char {
    static void main() {
        char x= 'a';   // đgl khởi tạo
        char x1= 8;   // đgl khởi tạo
        System.out.println(""+ x + (int)x1 );

        /*char x3;       // đgl khai báo
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char x4 = s.charAt(1);   // lấy kí tự thứ 2 của chuỗi nhập từu bàn phím
        System.out.println( x4);*/


        // string buider chuỗi có thể thay đổi cùng tìm  hiểu:

        StringBuilder chuoi = new StringBuilder( "hi "); // khởi tạo
        chuoi.append( "xin chào");    // append có  tác dụng thêm vào cuối chuỗi
        chuoi.append( " cậu");
        System.out.println( chuoi);
        chuoi.insert( 1 ,"aa" );  // insert chèn vào chuỗi ở vị trí ...
        System.out.println( chuoi);
        chuoi.delete(2, 4);                // delete giúp xóa ở vị trí nào. delete(bắt đầu , kết thúc)
        System.out.println( chuoi);
        System.out.println( chuoi.length());  // giúp trả về độ dài của chuỗi

        System.out.println("");
        System.out.println("");


        String s2 = "xin chào cậu";
        System.out.println(s2);
        String s3 = s2.substring( 3);   // lấy từ vị trí thứ 3 đến hết
        System.out.println( s3);
        String s4 = s2.substring( 3, 8);          // tương tự code 36. nhập 2 số sẽ lấy từ vị trí a đến vị trị b
        System.out.println( s4);


        System.out.println();
        System.out.println();

        String s5 = " ngủ ngủ nữa ngủ mãi";
        System.out.println(s5);
        String s6 = s5.replace( "ngủ", "học");   // thay thế ngủ bằng chữ học
        System.out.println( s6);

        String s7= s5.replaceFirst( "ngủ", "học"); // thay thế từ ngủ đầu tiên = học
        System.out.println(s7);

        String s8= "    Thái Dương  ";
        System.out.println( s8);
        String s9 = s8.trim();    // trim giúp xóa tất cả khoảng trắng đầu và cuối
        System.out.println( s9);



    }
}
