package Study;   // bài tập tính tổng các số có trong chuỗi ví dụ sfnj22nvksj4nv tổng bằng 26

public class B26_4_BT2 {
    static void main() {
        String chuoi = "english= 78 science= 83 math= 68 history= 65 ";
        System.out.println(" chuỗi của bạn là: " + chuoi);
        String [] mang = chuoi.split(" ");
        int tong = 0;
        int count=0;
        for ( String phantu : mang) {      // duyệt từng phần tử có trong mảng và gán vào biến phantu
            System.out.println(phantu);
            try {
                int so = Integer.parseInt(phantu);  // parseint ép số thành số chữ không ép được nên để trong try k bị lỗi
                tong +=so;
                count++;
            }
            catch (Exception e){}

        }
        double tbc = (double)tong/count;
        System.out.printf("%.2f",tbc);


    }
}
