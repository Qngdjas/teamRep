/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamdev1;

/**
 *
 * @author Qngdjas
 */
public class Course {

    private Student[] student;

    private String name;

    public Student[] getStudent() {
        return student;
    }

    public void setStudent(Student[] student) {
        this.student = student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ClassPojo [student = " + student + ", name = " + name + "]";
    }
}
