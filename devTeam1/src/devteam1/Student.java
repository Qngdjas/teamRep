/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devteam1;

/**
 *
 * @author Qngdjas
 */
public class Student {

    private String name;

    private String mark;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "ClassPojo [name = " + name + ", mark = " + mark + "]";
    }
}
