package Study;

import java.util.Arrays;
import java.util.Scanner;

public class B27_1_Mang {

    // ---------------khởi tạo mảng:---------------------------
    String[] mang = new String[3];      // mảng có 3 index
    int[] mang1 = new int[4];            // mảng có 4 index
    String[] mang2 = new String[]{"một ", "hai ", "..."};

    //--------------------- khai báo mảng:-------------
    String[] mang3;
    int[] mang4;

    static void main() {  // khởi tạo mảng
        System.out.println("");
        System.out.println(" ---sout mảng ở vị trí index cụ thể---");
        String[] mang2 = new String[]{"một ", "hai ", "ba", "..."};
        System.out.println("mảng: "+Arrays.toString(mang2));
        System.out.println("mảng ở vị trí index 1 là: "+mang2[1]);


        //--------------- duyệt mảng---------------------------
        //CÁCH 1:
        System.out.println("");
        System.out.println(" ---duyệt mảng cách 1---");
        for (String phantu : mang2) {   // giúp chạy lần lượt từng phần tử có trong mảng và gán vào biến phantu lặp lại cho đến khi hết phần tử trong mang
            System.out.println("duyệt mảng: " + phantu);
        }

        // CÁCH 2:
        System.out.println("");
        System.out.println(" ---duyệt mảng cách 2---");
        for (int i = 0; i < mang2.length; i++) {
            System.out.println(mang2[i]);
        }

        //CÁCH 3:  -----------array--------------
        System.out.println("");
        System.out.println(" ---duyệt mảng cách 3---");
        System.out.println(Arrays.toString(mang2));

        System.out.println("");

        //---------------------clone-------------------------------------------------

        System.out.println(" ---tìm hiểu về clone---");
        int [] mang5= new int[]{7,2,3,4,5};
        int [] mang6= mang5;
        mang5[0]= 1;
        System.out.println(Arrays.toString(mang5));
        System.out.println(Arrays.toString(mang6));

        System.out.println(" khi có clone: ");
        int [] mang55= new int[]{7,2,3,4,5};
        int [] mang66= mang55.clone();
        mang55[0]= 1;
        System.out.println(Arrays.toString(mang55));
        System.out.println(Arrays.toString(mang66));


        // SẮP XẾP MẢNG tăng
        Scanner sc = new Scanner(System.in);

        System.out.println("");
        System.out.println( " nhập số phần tử có trong mảng: ");
        int n = sc.nextInt();
        int [] mang3 = new int[n];
        for (int i = 0; i < mang2.length; i++) {
            System.out.println(" mang3["+ i+"]: ");
            mang3[i]= sc.nextInt();
        }
        Arrays.sort(mang3); // sắp xếp mangr3 theo thứ tự tăng dần
        System.out.println(" sắp xếp tăng dần:"+ Arrays.toString(mang3));

        // sắp xếp mảng giảm

        // array.sort đã tạo 1 mangr3 tăng dần, giờ tạo vòng lặp in ra từ index cuối mảng tới  index đầu mảng
        System.out.println(" sắp xếp giảm dần: ");
        for (int j=mang3.length-1; j>=0; j-- ){
            System.out.println(mang3[j]);
        }

    }


}


