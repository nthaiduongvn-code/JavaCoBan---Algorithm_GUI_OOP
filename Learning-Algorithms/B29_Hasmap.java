package Study;              // tìm hiểu về hàm ----  hashmap<key, value>  -----

import java.util.HashMap;

public class    B29_Hasmap {
    static void main(String[] args) {

        //khai báo
        HashMap < Integer, String> map= new HashMap<>();
        HashMap < String, Integer> map1= new HashMap<>();


        // thêm phần tử vào hasmap
        map.put(1, "apple");
        map.put(2, "banana");
        map.put(3, "orange");


        //lấy giá trị của 1 phần tử
        String value = map.get(1);
        String value2 = map.get(2);
        String value3 = map.get(3);
        System.out.println(value);
        System.out.println(value2);
        System.out.println(value3);
        System.out.println("------------------------------------------");


        // xóa phần tử khỏi hasmap

        map.remove(3);
        System.out.println(map.get(2));
        System.out.println(map.get(3));   // sẽ trả về giá trị null khong tồn tại
        System.out.println("------------------------------------------");

        // kiểm tra 1 phần tử có trong map không, containskey kiểm tra key, containsvalue kiểm tra value
        boolean check = map.containsValue("apple");
        boolean check2 = map.containsKey(2);
        System.out.println(check);
        System.out.println(check2);
        System.out.println("------------------------------------------");


        // kiểm tra map có rỗng không
        boolean emti = map.isEmpty();
        System.out.println(emti);
        System.out.println("------------------------------------------");


        //  lấy số lượng phần tử trong map
        System.out.println( map.size());
        System.out.println("-----------------------------------------");


        //duyệt hasmap
        for (Integer key: map.keySet()) {
            String giatri = map.get(key);
            System.out.println(key+ ": " + giatri);
        }




    }
}
