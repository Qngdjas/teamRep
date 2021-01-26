/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamdev1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONObject;

/**
 *
 * @author Qngdjas
 */
public class JSONWriter {

    public static boolean writer(Courses cs) {
        JSONObject jsonObj = new JSONObject(cs);
        File f = new File("src/teamdev1/DatabseByMarshalling.json");
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new BufferedWriter(new FileWriter(f)));
            pw.print(jsonObj);
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
