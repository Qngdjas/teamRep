package teamrepcollect;

//Подключение библиотек
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import org.json.JSONObject;

/**
 *
 * @author Qngdjas
 */
//Класс-writer POJO в JSON
public class JSONWriter {

    /*Метод записи POJO в JSON(Вход POJO-courses, файл, в который запишется
      информация выход - логическая переменная(запись прошла (не)успешно))*/
    public static boolean writer(Courses cs, File file) {
        //Инициализация JSON-объекта на основе POJO
        JSONObject jsonObj = new JSONObject(cs);
        PrintWriter pw = null;
        try {
            //Запись JSON-объекта в файл
            pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));
            pw.print(jsonObj);
            //Вывод результата на консоль
            System.out.println(jsonObj);
            return true;
        } catch (IOException ex) {
            System.out.println("Writer error");
            return false;
        } finally {
            if (pw != null) {
                pw.close();
            }
        }
    }
}
