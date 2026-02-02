package Study;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class B28_1_mangdongArraylist {
    static void main() {


        // khai báo list
        ArrayList<Integer> mang = new ArrayList<>();
        System.out.println("-----------------------------------------------");


        // khai báo với số lượng phần tử ban đầu
        ArrayList<Integer> mang2 = new ArrayList<>(5);
        System.out.println("-----------------------------------------------");


        // khởi tạo
        ArrayList<Integer> mang3 = new ArrayList<>(List.of(4, 1, 3, 4, 2));
        System.out.println("-----------------------------------------------");


        // xuất list
        System.out.println(mang3);

        // add thêm phần tử vào list
        mang3.add(9);
        System.out.println(mang3);

        // add vào index cụ thể  ví dụ index 2
        mang3.add(2, 8);
        System.out.println(mang3);

        // trả về số phần tử của list
        System.out.println("số phần tử của mảng 3 là: " + mang3.size());

        // trả về giá trị tại index cụ thể
        System.out.println("giá trị tại index 2 là: " + mang3.get(2));

        // xóa giá trị tại index cụ thể vd index2:
        mang3.remove(2);
        System.out.println("mang3 sau khi xóa index 2 là: \n" + mang3);
        System.out.println("-----------------------------------------------");

        // xóa giá trị cụ thể vd xóa số thứ 2
        ArrayList<Integer> mang4 = new ArrayList<>(List.of(0, 1, 2, 3, 4));
        System.out.println(mang4);
        mang4.remove(Integer.valueOf(2));
        System.out.println("sau khi xóa số 2 trong mảng: " + mang4);
        System.out.println("-----------------------------------------------");

        //thay đổi thông tin tại index 1 bằng số 8
        ArrayList<Integer> mang5 = new ArrayList<>(List.of(0, 1, 2, 3, 4));
        System.out.println(mang5);
        mang5.set(1, 8);
        System.out.println("mảng sau khi thay index 1 bằng 8" + mang5);
        System.out.println("-----------------------------------------------");


        //contain kiểm tra phần tử có chứa trong mảng không
        ArrayList<String> ten = new ArrayList<>(List.of("Dương", "kiệt", "Huy "));
        System.out.println(ten);
        String phantu = "hh";
        if (ten.contains(phantu))
            System.out.println(" Danh sách có bao gồm tên "+ phantu);
        else
            System.out.println(" Danh sách không bao gồm tên "+phantu);
        System.out.println("-----------------------------------------------");



        // sắp xếp mảng arraylist  Collection.sort(mang8)
        ArrayList <Integer> mang6 = new ArrayList<>(List.of(1,5,4,2,3,8,7,6,8));
        System.out.println("mảng khi chưa sắp xếp: "+mang6);

        Collections.sort( mang6);  //---------
        System.out.println("mảng khi sắp xếp là:   "+mang6);
        System.out.println("-----------------------------------------------");



        // tìm phần tử có tồn tại trong mảng không, nếu có trả về index cụ thể, nếu tồn tại 2 hoặc nhiều phần
        // tử trả về index phần tử đầu tiên (biết thêm: còn lastIndexOf trả về index phần tử cuối cùng), nếu không tồn tại trả về -1 (mặc định -1)

        System.out.println("index: "+ mang6.indexOf(8)); //  tìm số 8 trong mảng 6 vì tồn tại 2 số 8 trog mảng trả về index số 8 đầ tiên
        System.out.println("index: "+ mang6.indexOf(9)); // không có số 0 trả về -1








    }
}
