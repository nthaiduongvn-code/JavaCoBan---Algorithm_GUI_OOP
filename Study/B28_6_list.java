package Study;
                    /* viết chương trình nhập vào 1 list có n phần tử ngẫu nhiên,
                     các phần tử là số nguyên, n input,
                      1. in ra có bao nhiêu số nhỏ hơn 50
                      2. in ra vị trí index các số đó  */

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class B28_6_list {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập số phần tử: ");
        int n = sc.nextInt();
        ArrayList <Integer> list = new ArrayList<>();
        ArrayList <Integer> list2 = new ArrayList<>();
        String index="";
        for (int i = 0; i < n; i++) {
            Random rd= new Random();
            int so = rd.nextInt(0,101);
            list.add(so);
        }
        System.out.println( "list="+ list);
        for (int i = 0; i < n; i++){
            if (list.get(i)<50){
                list2.add(list.get(i));
                index +=(i +" ");
            }
        }
        System.out.println("phần tử nhỏ hơn 80:");
        System.out.println("list="+list2);
        System.out.println("tại index: "+ index);

    }
}
