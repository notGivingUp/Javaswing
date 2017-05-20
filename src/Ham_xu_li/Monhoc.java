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
public class Monhoc {
    private String subject_id;
    private int semester;
    private String subject_name;
    private float coefficient;
    private String institute;

    public Monhoc() {
    }

    public Monhoc(String subject_id, int semester, String subject_name, float coefficient, String institute) {
        this.subject_id = subject_id;
        this.semester = semester;
        this.subject_name = subject_name;
        this.coefficient = coefficient;
        this.institute = institute;
    }

    public String getSubject_id() {
        return subject_id;
    }

    public void setSubject_id(String subject_id) {
        this.subject_id = subject_id;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getSubject_name() {
        return subject_name;
    }

    public void setSubject_name(String subject_name) {
        this.subject_name = subject_name;
    }

    public float getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(float coefficient) {
        this.coefficient = coefficient;
    }

    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }
    
    
}
