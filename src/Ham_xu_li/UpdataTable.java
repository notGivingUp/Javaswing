
package Ham_xu_li;

import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.*;// thu vien cua rs2xml.jar
public class UpdataTable {
    public static PreparedStatement pst;//bien thuc thi cau lenh sql
    public static ResultSet rs;//ket qua tra ve dang 1 bang hay 1 dong du lieu
    public static Connection conn = ConnectDB.getConnect();
    
    //ham nap du lieu cho bang
    
    
    public static void LoadData(String sql, JTable tb){
        try {
            pst = Giaodien.Main.conn.prepareStatement(sql);
            rs = pst.executeQuery();
            tb.setModel(DbUtils.resultSetToTableModel(rs));
            //đã nạp dữ lên bảng mà mình truyền vào
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e,"Thong bao loi",1);
        }
    }
}