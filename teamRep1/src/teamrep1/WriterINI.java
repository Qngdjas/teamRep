package teamrep1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriterINI {

    public static boolean writer(String text) {
        File fileINI = new File("Input.ini");
        FileWriter fw = null;
        BufferedWriter bw = null;
        PrintWriter pw = null;
        try {
            fw = new FileWriter(fileINI);
            bw = new BufferedWriter(fw);
            pw = new PrintWriter(bw);
            pw.println(text);
            return true;
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            return false;
        } finally {
            if (pw != null) {
                pw.close();
            }
        }
    }
}
