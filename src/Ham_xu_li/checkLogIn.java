
package Ham_xu_li;
import Ham_xu_li.*;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class checkLogIn {
    public static Connection conn = null;
    public static ResultSet rs = null, rs1 = null;
    public static PreparedStatement pst = null;
    public static String testConnect(){
        try {
            conn = ConnectDB.getConnect();
            return "Ket noi co so du lieu thanh cong";
        } catch (Exception e) {
            return "Ket noi co so du lieu that bai";
        }
    }
    public static byte CheckInfo(String user_id, String password){
        String sql = "SELECT password FROM user WHERE user_id=?";
        try{
        pst = (PreparedStatement) conn.prepareStatement(sql);
        pst.setString(1, user_id);
        rs = pst.executeQuery();
        
        rs.next();
        if (rs == null) return 0;
        String str=rs.getString(1);
           // JOptionPane.showMessageDialog(null, str);
        if (str.equals(password)) return 1; else return -1;
        
        } catch (Exception e){
            return 0;
        }
    }
    
    public static ResultSet checkUser(String user_id, String password){
        String sql = "SELECT * FROM user WHERE user_id=? AND password=?";
        try{
        pst = (PreparedStatement) conn.prepareStatement(sql);
        pst.setString(1, user_id);
        pst.setString(2, password);
        return rs = pst.executeQuery();
        } catch (Exception e){
            return null;
        }
    }
}