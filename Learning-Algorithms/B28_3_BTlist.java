package Study;
          // tạo 1 list có n phần tử, n input , và phần tử ngẫu nhiên từ 1 đến 100

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class B28_3_BTlist {
    static void main() {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhập số phần tử: ");
        int n = sc.nextInt();
        ArrayList<Integer> mang = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = rd.nextInt(1,100);
            mang.add(a);
        }
        System.out.println("mảng list được tạo ngẫu nhiên là: "+ mang);
    }


}
