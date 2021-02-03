/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamrepcollect;

import java.io.File;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Qngdjas
 */
public class UnmarshallingClassTest {

    /**
     * Тест корректности анмаршаллинга 1
     */
    @Test
    public void testUnmarshalling1() {
        Courses cs = UnmarshallingClass.unmarshalling(new File("src/teamrepcollect/InputXML.xml"));
        assertEquals("Mathematics", cs.getCourse().get(0).getName());
    }

    /**
     * Тест корректности анмаршаллинга 2
     */
    @Test
    public void testUnmarshalling2() {
        Courses cs = UnmarshallingClass.unmarshalling(new File("src/teamrepcollect/InputXML.xml"));
        assertEquals("Physics", cs.getCourse().get(1).getName());
    }

    /**
     * Тест корректности анмаршаллинга 3
     */
    @Test
    public void testUnmarshalling3() {
        Courses cs = UnmarshallingClass.unmarshalling(new File("src/teamrepcollect/InputXML.xml"));
        assertEquals("Phylosophy", cs.getCourse().get(2).getName());
    }

}
