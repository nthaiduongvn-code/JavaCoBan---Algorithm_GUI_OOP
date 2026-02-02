package Study;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class B22_Calendar {
    static void main() {
        Calendar cal = Calendar.getInstance();
        System.out.println( cal);
        int nam = cal.get(Calendar.YEAR);
        int thang = cal.get(Calendar.MONTH);
        int ngay = cal.get(Calendar.DATE);
        System.out.println( " ngày: "+ ngay );
        System.out.println( " tháng: " + (thang+1) );
        System.out.println( " năm:  " + nam );

        // set ngày theo ý muốn:

        cal.set( Calendar.YEAR, 2006);
        cal.set( Calendar.MONTH, 9);
        cal.set( Calendar.DATE, 31);
        int currentYear = cal.get(Calendar.YEAR);
        int currentMonth = cal.get(Calendar.MONTH);
        int currentDate = cal.get(Calendar.DATE);
        System.out.println( " currentDate is: " + currentDate);
        System.out.println( " currentMonth is: " + (currentMonth + 1));
        System.out.println( " currentYear is: " + currentYear);

        // xuất theo định dạng ngày/ tháng/ năm , giờ/ phút/ giây

        SimpleDateFormat dinhDang= new SimpleDateFormat( "dd/MM/yyyy hh:mm:ss");
        Date time = cal.getTime();
        String s = dinhDang.format(time);
        System.out.println(s);



    }
}
