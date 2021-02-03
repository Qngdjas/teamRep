/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamrepcollect;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * POJO-courses
 *
 * @author Qngdjas
 */
@XmlRootElement(name = "courses")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"course"})
public class Courses {

    @XmlElement(name = "course")
    private ArrayList<Course> course = new ArrayList<Course>();

    public Courses() {
        super();
    }

    public ArrayList<Course> getCourse() {
        return course;
    }

    public void setCourse(ArrayList<Course> course) {
        this.course = course;
    }

    public boolean add(Course cr) {
        return course.add(cr);
    }

    @Override
    public String toString() {
        return "Courses [course = " + course + "]";
    }
}
