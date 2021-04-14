/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit07_HW;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Linh
 */
public class SortNVbyID implements Comparator<NhanVien> {

    @Override
    public int compare(NhanVien nhanVien1, NhanVien nhanVien2) {
        if (nhanVien1.getID() == nhanVien2.getID()) {
            return 1;
        }
        return -1;
    }
}
