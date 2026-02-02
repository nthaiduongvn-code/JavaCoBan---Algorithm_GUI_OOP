package Study;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class B27_3_BTMang {
    static Scanner sc = new Scanner(System.in);

    public static int []mang(){
        System.out.println(" Nhập số phần tử của mảng: ");
        int n= sc.nextInt();
        int [] mang = new int [n];
        Random rd = new Random();
        for (int i=0;i<n;i++){
            int so = rd.nextInt(1,9);
            mang[i]= so;
        }
        System.out.println(Arrays.toString(mang));
        return mang;

    }   // khởi tạo mảng and ouput--------------------------
    public static void arrays( int []mang){
    Arrays.sort(mang);
        System.out.println( Arrays.toString(mang));

    }
    public static void check(int [] mang){
        System.out.println(" nhập số muốn tìm trong mảng: "); int n= sc.nextInt();

        boolean kt= false;
        for(int i=0;i<mang.length;i++){
            if( mang[i]==n){
                System.out.println( n+ " có tồn tại trong mảng tại index: "+i);
                kt=true; break;
            }
        }
        if (!kt) System.out.println(n +" không tồn tại trong mãng");
    }


    static void main() {
        mang();       // tạo mảng bất kì

        int [] save= mang();   // tạo mảng bất kì và lưu vào mảng save để sử dụng ở hàm array dưới
        arrays(save);

        arrays(mang());  // tạo hàm mảng và truyền vào hàm array để sắp xếp

        // gọi hàm check
        check(mang());
    }
}
