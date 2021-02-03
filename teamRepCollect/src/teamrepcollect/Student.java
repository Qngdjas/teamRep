package teamrepcollect;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * POJO-student
 *
 * @author Qngdjas
 */
@XmlRootElement(name = "student")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"name", "mark"})
public class Student {

    @XmlAttribute(name = "name", required = true)
    private String name;
    @XmlAttribute(name = "mark", required = true)
    private String mark;

    public Student() {
    }

    public Student(String name, String mark) {
        this.name = name;
        this.mark = mark;
    }

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
        return "[name = " + name + ", mark = " + mark + "]";
    }
}
