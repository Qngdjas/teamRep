/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamdev1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author Qngdjas
 */
public class UnmarshallingClass {

    public static boolean unmarshalling() {
        try {
            JAXBContext context = JAXBContext.newInstance(Courses.class);
            Unmarshaller m = context.createUnmarshaller();
            FileReader reader = new FileReader("src/teamdev1/InputXML.xml");
            Courses courses = (Courses) m.unmarshal(reader);
            //Вывод прочитанного
            System.out.println(courses);
            return true;
        } catch (JAXBException ex) {
            System.out.println("Unmarshalling error");
            return false;
        } catch (FileNotFoundException ex) {
            System.out.println("Reading error");
            return false;
        }
    }
}
