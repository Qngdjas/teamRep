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
public class WriterINITest {

    /**
     * Тест записи в файл
     */
    @Test
    public void testWork() {
        File f = new File("test/teamrepcollect/WriterINITest.ini");
        ArrayList<String> text = null;
        boolean result = WriterINI.writer(text, f);
        Assert.assertTrue(result);
    }
}
