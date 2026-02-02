package Study;
                        // đường dẫn d:/thaiduong/music/chill.mp3
                   // tách tệp: chill.mp3
                   // tách tên file : chill

public class B26_10_tachchuoi {
    static void main() {
        String chuoi = "d:/thaiduong/music/chill.mp3";
        int index = chuoi.lastIndexOf('/');
        String chuoicon = chuoi.substring(index + 1);
        System.out.println(chuoicon);
        int index2 = chuoicon.lastIndexOf('.');
        String chuoicon3 = chuoicon.substring(0,index2);
        System.out.println(chuoicon3);
    }

}
