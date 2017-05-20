package Ham_xu_li;

import static Giaodien.Main.conn;
import static Giaodien.Main.pst;
import java.sql.*;
import javax.swing.*;

public class Admin {
    private static ResultSet rs;

    private int user_id;
    private String user_name;
    private String password;
    private int role;
    public static Connection conn = ConnectDB.getConnect();

    public Admin(int user_id, String user_name, String password, int role) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.password = password;
        this.role = role;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }
    
    

    public void insertUser(User user){
        String sql = "insert into user values (?,?,?,?,0,0,?,?,?,?)";
        //this.setBirth(birth);
        try {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, user.getUser_id());
            pst.setString(2, user.getUser_name());
            pst.setString(3, user.getPassword());
            pst.setInt(4, user.getRole());
            pst.setString(5, user.getBirth());
            pst.setInt(6, user.getGrade());
            pst.setString(7, user.getClass_name());
            pst.setString(8, user.getInstitute());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Đã thêm sinh viên " + user.getUser_name() + " thành công", "Thông báo", 1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Mã sinh viên " + user.getUser_id() + " tồn tại", "Thông báo", 1);
        }
    }

    public static void insertSubject(Monhoc monhoc) {
        String insert_subject = "INSERT INTO subject VALUES (?, ?, ?, ?, ?, 0, 0);";
        try {
            pst = Giaodien.Main.conn.prepareStatement(insert_subject);
            pst.setString(1, monhoc.getSubject_id());
            pst.setInt(2, monhoc.getSemester());
            pst.setString(3, monhoc.getSubject_name());
            pst.setFloat(4, monhoc.getCoefficient());
            pst.setString(5, monhoc.getInstitute());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Thêm môn hoc " + monhoc.getSubject_id() + " thành công", "Thông báo", 1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Thêm học phần bị lỗi", "Thông báo", 0);
            //return null;
        }
    }
//
    public static ResultSet searchSubjectByParams(String subject_id, int semester, String institute) {
        String search_subject = "SELECT * FROM subject WHERE subject_id=? AND semester=? AND institute=?;";
        try {
            pst = Giaodien.Main.conn.prepareStatement(search_subject);
            pst.setString(1, subject_id);
            pst.setInt(2, semester);
            pst.setString(3, institute);
            return rs = pst.executeQuery();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Không tìm thấy học phần", "Thông báo", 0);
            return null;
        }
    }
//
    public static void updateSubject(Monhoc monhoc, int is_opened, int is_registered) {
        String update_subject = "UPDATE subject SET subject_name=N'" + monhoc.getSubject_name() + "', coefficient='" + monhoc.getCoefficient() + "', is_opened='" + is_opened + "', is_registered='" + is_registered + "' WHERE subject_id='" + monhoc.getSubject_id() + "' AND semester='" + monhoc.getSemester() + "' AND institute='" + monhoc.getInstitute() + "';";
        try {
            pst = Giaodien.Main.conn.prepareStatement(update_subject);
            pst.execute();
            JOptionPane.showMessageDialog(null, "update", "Thông báo", 1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Update học phần bị lỗi", "Thông báo", 0);
            //return null;
        }
    }

    public static void insertPoint(Point point, int kihoc) {
        try {
            if ((point.getFirst_point() < 0) || (point.getFirst_point() > 10) || (point.getLast_point() < 0) || (point.getLast_point() > 10)) {
                JOptionPane.showMessageDialog(null, "Nhập điểm không hợp lệ","Thông báo",1);
            }
            String sql = "INSERT INTO `point`  VALUES (?,?,?,?,?,?);";

            float tk = ((point.getFirst_point() * 3) + (point.getLast_point() * 7)) / 10;
            String ch = point.getGrade();
            String point_id = point.getMark_id();
            point_id = kihoc + point.getSubject_id() + point.getUser_id();
            if (tk < 4) {
                ch = "F";
            }
            if ((tk >= 4) && (tk < 6)) {
                ch = "D";
            }
            if ((tk >= 6) && (tk < 7)) {
                ch = "C";
            }
            if ((tk >= 7) && (tk < 8.5)) {
                ch = "B";
            }
            if ((tk >= 8.5) && (tk < 10)) {
                ch = "A";
            }

            pst = conn.prepareStatement(sql);
            pst.setString(1, point.getSubject_id());
            pst.setInt(2, point.getUser_id());
            pst.setFloat(3, point.getFirst_point());
            pst.setFloat(4, point.getLast_point());
            pst.setString(5, point_id);
            pst.setString(6, ch);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Nhập điểm sinh viên thành công","Thông báo",1);
            //return 1;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Nhap diem loi", 1);
            //return -1;
        }

    }

    public static void openClass(Lophoc lophoc) {
        String sql = "insert into class values (?,?,?,?,1,0)";
        try {
            pst = Giaodien.Main.conn.prepareStatement(sql);
            pst.setInt(1, lophoc.getSemester());
            pst.setString(2, lophoc.getSubject_id());
            pst.setInt(3, lophoc.getClass_id());
            pst.setString(4, lophoc.getClass_name());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Mở lớp cho học phần " + lophoc.getSubject_id() + " thành công", "Thông báo", 1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void DangkiNC(int classid, int userid) {
        String sql = "insert into reg_class value (?,?)";
        try {
            pst = Giaodien.Main.conn.prepareStatement(sql);
            pst.setInt(1, classid);
            pst.setInt(2, userid);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Đăng kí lớp " + classid + " cho sinh viên " + userid + " thành công", "Thông báo", 1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static void xetTotNghiepByParams(int userid) {
        String sql = "select distinct subject_id,grade from point where user_id = '" + userid + "'";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            int count = 0;
            while (rs.next()) {
                String mark = rs.getString(2);
                if (mark.equals("A") || mark.equals("B") || mark.equals("C") || mark.equals("D")) {
                    count++;
                }
            }
            if (count >= 5) {
                JOptionPane.showMessageDialog(null, "Sinh vien " + userid + " đủ điều kiện tốt nghiệp");
            } else {
                JOptionPane.showMessageDialog(null, "Sinh viên " + userid + " chưa đủ điều kiện xét tốt nghiệp");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

}
