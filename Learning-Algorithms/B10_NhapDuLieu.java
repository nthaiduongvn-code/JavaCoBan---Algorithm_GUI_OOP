package Study;

import java.util.Scanner;

public class B10_NhapDuLieu {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print( " input number: ");


   int a = sc.nextInt();    // int thì nextint , float thì nextfloat , string thì nextline ...


        String b = (a%2 == 0) ? "chẵn" : "lẻ";
        System.out.println( a +" là số " + b);

//    nếu không gọi dòng số 7 ta có thể viết dòng số 11 là int a = new Scanner(System.in).nextInt;


    }
}
