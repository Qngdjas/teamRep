package teamrepcollect;

import java.io.File;
import java.util.ArrayList;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Qngdjas
 */
public class TeamRepCollectIT {

    /**
     * Интеграционный тест 1 (Полный)
     */
    @Test
    public void testMain() {
        File xmlDataBase = new File("src/teamrepcollect/InputXML.xml");
        //Чтение XML
        ArrayList<String> XMLData = ReaderXML.fileReader(xmlDataBase);
        //Вывод содержимого на консоль
        XMLData.forEach((line) -> {
            System.out.println(line);
        });
        //Вывод содержимого в файл
        File iniDataBase = new File("src/teamrepcollect/InputXML.ini");
        WriterINI.writer(XMLData, iniDataBase);
        //Анмаршаллинг XML в POJO
        Courses coursesDataBase = UnmarshallingClass.unmarshalling(xmlDataBase);
        //Запись POJO в JSON
        File JSONFile = new File("src/teamrepcollect/DatabseByMarshalling.json");
        boolean check = JSONWriter.writer(coursesDataBase, JSONFile);
        Assert.assertTrue(check);
    }

    /**
     * Интеграционный тест 2 (Частичный)
     */
    @Test
    public void testMain2() {
        File xmlDataBase = new File("src/teamrepcollect/InputXML.xml");
        //Чтение XML
        ArrayList<String> XMLData = ReaderXML.fileReader(xmlDataBase);
        //Вывод содержимого на консоль
        XMLData.forEach((line) -> {
            System.out.println(line);
        });
        //Вывод содержимого в файл
        File iniDataBase = new File("src/teamrepcollect/InputXML.ini");
        WriterINI.writer(XMLData, iniDataBase);
        //Анмаршаллинг XML в POJO
        Courses coursesDataBase = UnmarshallingClass.unmarshalling(xmlDataBase);
        assertEquals("Mathematics", coursesDataBase.getCourse().get(0).getName());
    }

    /**
     * Интеграционный тест 3 (Частичный)
     */
    @Test
    public void testMain3() {
        File xmlDataBase = new File("src/teamrepcollect/InputXML.xml");
        //Чтение XML
        ArrayList<String> XMLData = ReaderXML.fileReader(xmlDataBase);
        //Вывод содержимого на консоль
        XMLData.forEach((line) -> {
            System.out.println(line);
        });
        //Вывод содержимого в файл
        File iniDataBase = new File("src/teamrepcollect/InputXML.ini");
        boolean check = WriterINI.writer(XMLData, iniDataBase);
        Assert.assertTrue(check);
    }

}
