package teamrepcollect;

//Подключение библиотек
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

//Класс чтения файла
public class ReaderXML {

    //Метод чтения файла(Вход - файл, выход - содержимое файла в ArrayList<String>)
    public static ArrayList<String> fileReader(File fileXML) {
        Scanner reader = null;
        ArrayList<String> list = null;
        try {
            reader = new Scanner(fileXML);
            list = new ArrayList<>();
            String str;
            //Читаем из файла построчно
            while (reader.hasNextLine()) {
                //Запоминаем строки
                str = reader.nextLine();
                list.add(str);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Файл не найден");
        } finally {
            //Закрываем поток
            if (reader != null) {
                reader.close();
            }
            return list;
        }
    }
}
