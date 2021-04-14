/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit07_HW;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * ////
 *
 *
 * @author Linh
 */
public class NhanVienIOFile {

    public void write(ArrayList<NhanVien> listNV) throws IOException {
        try (Writer wr = new FileWriter("KSTNToanTinK62.txt")) {
            BufferedWriter bw = new BufferedWriter(wr);
            bw.close();
        } catch (IOException ex) {
            System.out.println("Lỗi ghi file: " + ex);
        }
    }

    public ArrayList<NhanVien> read() throws IOException {
        ArrayList<NhanVien> listNV = new ArrayList<>();
        try {
            InputStream in = new FileInputStream("KSTNToanTinK62.txt");
            Reader read = new InputStreamReader(in, "UTF-8");
            BufferedReader br = new BufferedReader(read);
            String s = br.readLine();
            while (s != null) {                
                System.out.println(s);
            }
            br.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NhanVienIOFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listNV;

    }

}
