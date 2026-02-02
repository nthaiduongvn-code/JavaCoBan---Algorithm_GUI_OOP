package Study;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* cho 1 list{ 1 , 9,3,9,14,5,27,8}
                         write program output số lớn thứ 2 và số nhỏ thứ 2 trong list
                         và in ra vị trí index của nó  */
public class B28_7_list {
    static void main() {
        ArrayList <Integer> list= new ArrayList<>(List.of(1 , 9,3,9,14,5,27,8));

        // tạo 1 list2 giống list
        ArrayList <Integer> list2= new ArrayList<>(list);

        // sắp xếp list2
         Collections.sort(list2);

        // output số lớn thứ 2 và số nhỏ thứ 2
        System.out.println(" số nhỏ thứ 2 trong list là: "+ list2.get(1));
        System.out.println(" số lớn thứ 2 trong list là: "+ list2.get(list2.size()-2));


        // output index số lớn thứ 2 và số nhỏ thứ 2       dùng abc.indexof(giá trị cần tìm index)
        System.out.println( " số nhỏ thứ 2 index is: "+list.indexOf(list2.get(1))) ;
        System.out.println( " số nhỏ thứ 2 index is: "+list.indexOf(list2.get(list2.size()-2))) ;






    }
}
