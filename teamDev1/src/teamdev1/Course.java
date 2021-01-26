/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamdev1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Qngdjas
 */
@XmlRootElement(name = "course")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"student", "name"})
public class Course {

    @XmlElement(name = "student", required = true)
    private Student student;
    @XmlAttribute(name = "name", required = true)
    private String name;

    public Course() {
    }

    public Course(String name, Student student) {
        this.name = name;
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
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
        return "[student = " + student + ", name = " + name + "]";
    }
}
