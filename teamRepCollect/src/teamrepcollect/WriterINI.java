package teamrepcollect;

//Подключение библиотек
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

//Класс записи в ini-файл
public class WriterINI {

    /*Метод записи в ini-файл(Вход - содержимое, которое нужно записать в виде
    ArrayList<String>, выход - логическая переменная(запись прошла (не)успешно))*/
    public static boolean writer(ArrayList<String> text) {
        //Файл, в который будет записана информация
        File fileINI = new File("src/teamrepcollect/Input.ini");
        FileWriter fw = null;
        BufferedWriter bw = null;
        PrintWriter pw = null;
        try {
            fw = new FileWriter(fileINI);
            bw = new BufferedWriter(fw);
            pw = new PrintWriter(bw);
            //Запись в файл
            pw.println(text);
            return true;
        } catch (IOException ex) {
            System.out.println("Ошибка");
            return false;
        } finally {
            if (pw != null) {
                pw.close();
            }
        }
    }
}
