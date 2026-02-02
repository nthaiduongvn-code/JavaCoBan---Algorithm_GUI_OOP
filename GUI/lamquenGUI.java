package GUI;
import javax.swing.*;      // Cần để lấy JFrame, JButton
import java.awt.*;         // Cần để lấy FlowLayout, Color


public class lamquenGUI extends JFrame {
    public lamquenGUI() {
        super("lamquenGUI");         // code 8 này giống code 9. nhưng super phải và chỉ được gọi đầu tiên trong contructor, còn các nơi khác như main... phải dùng settitle. trong main ví dụ khởi tạo JFrame f = new JFrame("Demo"); thì đúng
        setTitle(" lamquen GUI^.^ ");     // đặt tên cho cửa sổ
        setSize(400,300);    // kích thước cửa sổ
        setVisible(true);                 // hiện cửa sổ
        setLocationRelativeTo(null);      //  căn hiển thị ra giữa màn hình,
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // khi nhấn dấu x đóng cửa sổ chương trình vẫn chạy ngầm thêm lệnh này khi nhấn x chương trình sẽ thoát hẳn

        JPanel pnFlown = new JPanel();
        pnFlown.setBackground(Color.white);
        add(pnFlown);
        JButton bt1 = new JButton("nút nhấn 1");
        JButton bt2 = new JButton("nút nhấn 2");
        JButton bt3 = new JButton("nút nhấn 2");
        JButton bt4 = new JButton("nút nhấn 2");
        pnFlown.add(bt1);
        pnFlown.add(bt2);
        pnFlown.add(bt3);
        pnFlown.add(bt4);

        JPanel pnBorder = new JPanel();
        pnFlown.setLayout(new BoxLayout(pnFlown, BoxLayout.X_AXIS));
            





        setVisible(true);
    }
    static void main() {
            lamquenGUI ui = new lamquenGUI();
    }
}
