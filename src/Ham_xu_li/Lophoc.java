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
public class Lophoc {
    private int semester;
    private String subject_id;
    private int class_id;
    private String class_name;

    public Lophoc() {
    }

    public Lophoc(int semester, String subject_id, int class_id, String class_name) {
        this.semester = semester;
        this.subject_id = subject_id;
        this.class_id = class_id;
        this.class_name = class_name;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getSubject_id() {
        return subject_id;
    }

    public void setSubject_id(String subject_id) {
        this.subject_id = subject_id;
    }

    public int getClass_id() {
        return class_id;
    }

    public void setClass_id(int class_id) {
        this.class_id = class_id;
    }

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }
    
    
}
