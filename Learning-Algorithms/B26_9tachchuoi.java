package Study; // tách chuỗi abc123 thành 2 chuỗi chữ và số

public class B26_9tachchuoi {
    static void main() {
        String chuoi = "abc123";
        StringBuilder chu = new StringBuilder();
        StringBuilder so = new StringBuilder();
        for ( int i=0; i<chuoi.length(); i++) {
            char kt = chuoi.charAt(i);
            if (Character.isDigit(kt)) so.append(kt);        // append thêm vào cuối chuỗi số, nếu kt là số
            else if (Character.isLetter(kt)) chu.append(kt); // append thêm vào cuối chuỗi chữ nếu kt là chữ
        }
        System.out.println(" chuỗi chữ là: "+ chu);
        System.out.println(" chuỗi số là: "+ so);
    }
}
