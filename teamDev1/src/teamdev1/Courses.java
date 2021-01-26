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
public class Courses {

    private Course[] course;

    public Course[] getCourse() {
        return course;
    }

    public void setCourse(Course[] course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "ClassPojo [course = " + course + "]";
    }
}
