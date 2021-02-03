package teamrepcollect;

//Подключение библиотек
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author Qngdjas
 */
//Класс-анмаршаллер XML
public class UnmarshallingClass {

    //Метод анмаршаллинга(Вход - файл, выход - POJO-класс Courses)
    public static Courses unmarshalling(File file) {
        try {
            //Чтение XML
            JAXBContext context = JAXBContext.newInstance(Courses.class);
            Unmarshaller m = context.createUnmarshaller();
            FileReader reader = new FileReader(file);
            Courses courses = (Courses) m.unmarshal(reader);
            //Вывод прочитанного
            System.out.println(courses);
            return courses;
        } catch (JAXBException ex) {
            System.out.println("Unmarshalling error");
            return null;
        } catch (FileNotFoundException ex) {
            System.out.println("Reading error");
            return null;
        }
    }
}
