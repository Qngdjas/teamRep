/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamrepcollect;

import java.io.File;
import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Qngdjas
 */
public class JSONWriterTest {

    /**
     * Тест записи POJO в файл
     */
    @Test
    public void testWork() {
        Courses cs = new Courses() {
            {
                Student st = new Student("Max", "3");
                Course c = new Course("Math", st);
                this.add(c);
            }
        };
        File f = new File("test/teamrepcollect/JSONWriterTest.json");
        boolean result = JSONWriter.writer(cs, f);
        Assert.assertTrue(result);
    }
}
