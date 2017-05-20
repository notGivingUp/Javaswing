/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ham_xu_li;

import static Giaodien.Main.conn;
import static Giaodien.Main.pst;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author duc
 */
public class User {

    private int user_id;
    private String user_name;
    private String password;
    private int role;
    private int subject_count;
    private int passed_year;
    private String birth;
    private int grade;
    private String class_name;
    private String institute;

    public User(int user_id, String user_name, String password, int role, int subject_count, int passed_year, String birth, int grade, String class_name, String institute) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.password = password;
        this.role = role;
        this.subject_count = subject_count;
        this.passed_year = passed_year;
        this.birth = birth;
        this.grade = grade;
        this.class_name = class_name;
        this.institute = institute;
    }

    public User() {
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

    public int getSubject_count() {
        return subject_count;
    }

    public void setSubject_count(int subject_count) {
        this.subject_count = subject_count;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }

    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }

    public int getPassed_year() {
        return passed_year;
    }

    public void setPassed_year(int passed_year) {
        this.passed_year = passed_year;
    }

    
}
