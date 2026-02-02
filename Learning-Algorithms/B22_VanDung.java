package Study;   // bài tập nhập vào ngày tháng năm sinh và tính tuổi hiện tại ❤️

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class B22_VanDung {
    static void main() {

        Scanner birthday= new Scanner(System.in);
        System.out.print( " mời nhập vào ngày sinh: ");   int dateOfBirth  = birthday.nextInt();
        System.out.print( " mời nhập vào tháng sinh: ");  int monthOfBirth = birthday.nextInt();
        System.out.print( " mời nhập vào năm sinh: ");    int yearOfBirth  = birthday.nextInt();

// khởi tạo: làm cho biết. có thể xóa phần khởi tạo, khởi tạo hàm calendar để ngày tháng theo định dạng vd.không có ngày 32
        Calendar birthday0 = Calendar.getInstance();
        birthday0.set(yearOfBirth , monthOfBirth-1, dateOfBirth );
        int ngaysinh = birthday0.get(Calendar.DATE);
        int thangsinh = birthday0.get(Calendar.MONTH);
        int namsinh = birthday0.get(Calendar.YEAR);
        System.out.println( " ngày tháng năm sinh: "+ ngaysinh+ "/" + (thangsinh+1) + "/" + namsinh);

// cập nhật năm hiện tại để tính tuổi:
        Calendar now = Calendar.getInstance();
        int currentYear = now.get(Calendar.YEAR);
        int currentMonth = now.get(Calendar.MONTH);
        int currentDate  = now.get(Calendar.DATE);

//  tính tuổi:
        int tuoi = currentYear - yearOfBirth;
        System.out.println( " tuổi của bạn là: "+ tuoi);

    }
}
