package teamrepcollect;

//Подключение библиотек
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

    //Метод анмаршаллинга(выход - POJO-класс Courses)
    public static Courses unmarshalling() {
        try {
            //Чтение XML
            JAXBContext context = JAXBContext.newInstance(Courses.class);
            Unmarshaller m = context.createUnmarshaller();
            FileReader reader = new FileReader("src/teamdev1/InputXML.xml");
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
