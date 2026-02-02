package Study;

public class B26_3_tachchuoi {
    static void main() {
        // tách chuỗi
        String s= "cùng tìm hiểu về,,, tách chuỗi";
        System.out.println( s);
        String[] mang = s.split(",,,");       // tách chuỗi theo dấu ,,,

        //duyệt mảng
        for (int i=0; i<mang.length; i++) {
            System.out.println(mang[i]);
        }

        // kiểm tra tưn phần tử trong mảng
        String s1= "abc123";
        System.out.println( s1);
        char[] mang1 = s1.toCharArray();
        for (int i=0; i<mang1.length; i++) {
            System.out.println(mang1[i]);
        }
        // đảo ngược chuỗi
        String s2= "abc123";
        StringBuilder s3 = new StringBuilder(s2);
        s3.reverse();
        System.out.println(s2);
        System.out.println( s3);

    }
}
