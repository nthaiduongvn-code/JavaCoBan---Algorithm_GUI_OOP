package Study;
                   // viết chương trình nhập vào 1 danh sách list sau đó:
                   //tạo ra 1 list mới bình phương các phần tử
                   // xác định có bao nhiêu phần tử lớn hơn 50

import java.util.ArrayList;
import java.util.List;
public class B28_4_list {
    static void main() {
        ArrayList <Integer> list= new ArrayList<>(List.of(5,11,2,4,6,9));
        ArrayList <Double> list2 = new ArrayList<>();
        System.out.println(" list: "+ list);
        int dem=0;
        for (int phantu : list) {
            Double binhphuong = Math.pow(phantu, 2);
            list2.add(binhphuong);
            if (binhphuong>50)
                dem++;
        }
        System.out.println("sau khi bình phương các phần tử\n list: "+ list2);
        System.out.println(" số phần tử lớn hơn 50 sau khi bình phương là: "+ dem);

    }
}
