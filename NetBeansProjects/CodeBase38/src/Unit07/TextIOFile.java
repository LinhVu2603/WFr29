/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Linh
 */
public class TextIOFile {

    public static void main(String[] args) {
        try {
            Writer wr = new FileWriter("product.txt");
            BufferedWriter bw = new BufferedWriter(wr);
            bw.write("Iphone 4\t 20.000.000\t Apple");
            bw.newLine();
            bw.write("Iphone 5\t 20.999.999\t Apple");
            bw.newLine();
            bw.write("Iphone 6\t 20.000.000\t Apple");
            bw.close();
            InputStream in = new FileInputStream("product.txt");
            Reader read = new InputStreamReader(in, "UTF-8");
            BufferedReader br = new BufferedReader(read);
            String s = br.readLine();
            int i = 0;
            while (s != null) {
                i++;
                System.out.println(i + ":" + s);
                s = br.readLine();
            }
            br.close();
        } catch (IOException ex) {
            Logger.getLogger(TextIOFile.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
