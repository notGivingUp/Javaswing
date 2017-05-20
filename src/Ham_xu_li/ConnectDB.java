
package Ham_xu_li;
import java.sql.*;
import javax.swing.JOptionPane;


public class ConnectDB {
    public static Connection getConnect(){
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/btl","root","hoxuanduc95");
            return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ket noi db that bai","Thong bao",1);
            //thoat chuong trinh khi hien ra thong bao
            System.exit(0);
            return null;
        }
    }
}
