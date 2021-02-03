/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamrepcollect;

import java.io.File;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Qngdjas
 */
public class ReaderXMLTest {
    
    /**
     * Тест, что файла нет
     */
    @Test
    public void testNoFile() {
        File f = new File("test/teamrepcollect/NoFile.txt");
        ArrayList<String> result = ReaderXML.fileReader(f);
        Assert.assertNull(result);
    }
    /**
     * Тест, что файл есть
     */
    @Test
    public void testFileIsExists() {
        File f = new File("src/teamrepcollect/InputXML.xml");
        ArrayList<String> result = ReaderXML.fileReader(f);
        Assert.assertNotNull(result);
    }

    /**
     * Тест, что файл содержит информацию
     */
    @Test
    public void testNotNullContentEdit() {
        File f = new File("src/teamrepcollect/InputXML.xml");
        ArrayList<String> result = ReaderXML.fileReader(f);
        ArrayList<String> expected = new ArrayList<>();
        Assert.assertNotEquals(expected, result);
    }

    /**
     * Тест, что файл не содержит информацию
     */
    @Test
    public void testVoidContentEdit() {
        File f = new File("test/teamrepcollect/VoidTest.xml");
        ArrayList<String> result = ReaderXML.fileReader(f);
        ArrayList<String> expected = new ArrayList<>();
        Assert.assertEquals(expected, result);
    }
    
}
