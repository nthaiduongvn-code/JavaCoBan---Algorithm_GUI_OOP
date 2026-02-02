package Study;    // chuẩn hóa input, tháI DƯƠng   biết       lậP  TrìnH
                  // làm cho câu văn cach nhau bởi dấu cách ,viết hoa chữ cái đầu Thái Dương biết lập trình


public class B26_12_chuanhoa {
    public static String chuanhoa( String input){
        input = input.trim();
        String [] chuoicon= input.split("\\s+"); // tách chuỗi input theo 1 hoặc nhiều khoảng trắng (\s+) java phải thêm dấu \ trước \s
        for ( int i=0; i<chuoicon.length; i++ ) {
            char firstchar = chuoicon[i].charAt(0);
            firstchar = Character.toUpperCase(firstchar);
            String kt= chuoicon[i].substring(1).toLowerCase();
            chuoicon[i]= firstchar +kt;
        }
        return String.join(" ",chuoicon); // nối các chuỗi con lại bởi dấu space
    }


    static void main() {
        String input="  tháI dƯƠng   biết       lậP  TrìnH";
        System.out.println(chuanhoa(input));
    }
}
