/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ham_xu_li;

/**
 *
 * @author duc
 */
public class Point {
    private String subject_id;
    private int user_id;
    private float first_point;
    private float last_point;
    private String mark_id;
    private String grade;

    public Point() {
    }

    public Point(String subject_id, int user_id, float first_point, float last_point) {
        this.subject_id = subject_id;
        this.user_id = user_id;
        this.first_point = first_point;
        this.last_point = last_point;
        //this.mark_id = mark_id;
        //this.grade = grade;
    }

    public String getSubject_id() {
        return subject_id;
    }

    public void setSubject_id(String subject_id) {
        this.subject_id = subject_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public float getFirst_point() {
        return first_point;
    }

    public void setFirst_point(float first_point) {
        this.first_point = first_point;
    }

    public float getLast_point() {
        return last_point;
    }

    public void setLast_point(float last_point) {
        this.last_point = last_point;
    }

    public String getMark_id() {
        return mark_id;
    }

    public void setMark_id(String mark_id) {
        this.mark_id = mark_id;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    
}
