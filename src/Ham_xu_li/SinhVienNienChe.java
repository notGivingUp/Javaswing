/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ham_xu_li;

import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author duc
 */
public class SinhVienNienChe extends User {
    public static Connection conn = ConnectDB.getConnect();
    public static PreparedStatement pst = null;
    public static ResultSet rs = null;

    public SinhVienNienChe(int user_id, String user_name, String password, int role, int subject_count, int passed_year, String birth, int grade, String class_name, String institute) {
        super(user_id, user_name, password, role, subject_count, passed_year, birth, grade, class_name, institute);
    }
    
    public static void Loaddiem(JTable tb, String userid){
        try {
            String sql = "SELECT reg_subject.semester as 'Ki hoc', point.subject_id as 'Ma mon hoc', subject_name as 'Ten mon', first_point as 'Diem GK', last_point as 'Diem CK', grade as 'Tong ket' FROM point INNER JOIN subject INNER JOIN reg_subject ON point.subject_id = subject.subject_id AND point.subject_id = reg_subject.subject_id WHERE point.user_id = ?;";
            //String sql1 = "select * from point where `user_id` = '"+userid+"'";    
            pst = conn.prepareStatement(sql);
            pst.setString(1, userid);
            rs = pst.executeQuery();
            tb.setModel(DbUtils.resultSetToTableModel(rs));
            //đã nạp dữ lên bảng mà mình truyền vào
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e,"Thong bao loi",1);
        }
    
    }

    public SinhVienNienChe() {
        
    }
}
