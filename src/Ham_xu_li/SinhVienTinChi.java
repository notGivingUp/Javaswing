/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ham_xu_li;

import static Ham_xu_li.SinhVienNienChe.conn;
import static Ham_xu_li.SinhVienNienChe.pst;
import static Ham_xu_li.SinhVienNienChe.rs;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author duc
 */
public class SinhVienTinChi extends User {

    public SinhVienTinChi(int user_id, String user_name, String password, int role, int subject_count, int passed_year, String birth, int grade, String class_name, String institute) {
        super(user_id, user_name, password, role, subject_count, passed_year, birth, grade, class_name, institute);
    }
        public static void Loaddiem(JTable tb, String userid){
        try {
            String sql = "SELECT reg_subject.semester as 'Ki hoc', point.subject_id as 'Ma mon hoc', subject_name as 'Ten mon', first_point as 'Diem GK', last_point as 'Diem CK', grade as 'Tong ket' FROM point INNER JOIN subject INNER JOIN reg_subject ON point.subject_id = subject.subject_id AND point.subject_id = reg_subject.subject_id WHERE point.user_id = ?;";
                
            pst = conn.prepareStatement(sql);
            pst.setString(1, userid);
            rs = pst.executeQuery();
            tb.setModel(DbUtils.resultSetToTableModel(rs));
            //đã nạp dữ lên bảng mà mình truyền vào
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e,"Thong bao loi",1);
        }
    
    }

    public SinhVienTinChi() {
        
    }
    public void DangkiHP(int semester, String sj_id, int user_id) {
        String sql = "insert into reg_subject values (?,?,?)";
        try {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, semester);
            pst.setString(2, sj_id);
            pst.setInt(3, user_id);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Đã đăng kí môn học " + sj_id + " thành công", "Thông báo", 1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Môn học " + sj_id + " bị trùng đăng kí", "Thông báo", 1);
        }
    }

    public static void DeleteSJ(String sj_id) {
        String sql = "delete from reg_subject where subject_id = '" + sj_id + "'";
        try {
            Statement stm = conn.prepareStatement(sql);
            stm.execute(sql);
            JOptionPane.showMessageDialog(null, "Hủy đăng kí môn học " + sj_id + " thành công", "Thông báo", 1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static void DangkiLop(int class_id, int userid) {
        String sql = "insert into reg_class values (?,?)";
        try {
            pst = Giaodien.Main.conn.prepareStatement(sql);
            pst.setInt(1, class_id);
            pst.setInt(2, userid);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Đã đăng kí lớp " + class_id + " thành công", "Thông báo", 1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            JOptionPane.showMessageDialog(null, "Mã lớp " + class_id + " bị trùng đăng kí", "Thông báo", 1);
        }
    }

    public static void HuyLop(int class_id) {
        String sql = "delete from reg_class where reg_class.class_id = " + class_id + "";
        try {
            Statement stm = Giaodien.Main.conn.prepareStatement(sql);
            stm.execute(sql);
            JOptionPane.showMessageDialog(null, "Hủy đăng kí môn học " + class_id + " thành công", "Thông báo", 1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
