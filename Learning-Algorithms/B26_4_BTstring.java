package Study;      // bài tập kiểm tra chuỗi kí tự nhập vào có bao nhiêu kí tự thường, hoa, số, đặc biệt.

import java.util.Scanner;

public class B26_4_BTstring {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println( " mời nhâ vào chuỗi kí tự: ");
        String chuoi = sc.nextLine();
        int ktThuong=0;
        int ktHoa=0;
        int ktSo=0;
        int ktSpace=0;
        int ktDacBiet= 0;

        for (int i=0; i< chuoi.length(); i++)
        {
            char kt = chuoi.charAt(i);
            if (Character.isLowerCase(kt)) {
                ktThuong++;
            }
            else if (Character.isUpperCase(kt)) {
                ktHoa++;
            }
            else if (Character.isDigit(kt)) {
                ktSo++;
            }
            else if (Character.isWhitespace(kt)) {
                ktSpace++;
            }
            else  ktDacBiet++;;
        }
        System.out.println( " number islowercase is:  " + ktHoa);
        System.out.println( " số kí tự thường là: "+ ktThuong);
        System.out.println( " số kí tự chữ số là: "+ ktSo);
        System.out.println( " number space is: "+ ktSpace);
        System.out.println( " số kí tự đặc biệt là: "+ ktDacBiet);


    }
}
