package teamrepcollect;

//Подключение библиотек
import java.io.File;
import java.util.ArrayList;

/**
 * Сборка проекта
 *
 * @author Qngdjas
 */
//Класс-сборщик
public class TeamRepCollect {

    //Выполнение функций программы
    public static void main(String[] args) {
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
        JSONWriter.writer(coursesDataBase, JSONFile);
    }

}
