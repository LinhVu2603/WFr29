/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit07_HW;

import java.util.Comparator;

/**
 *
 * @author Linh
 */
public class SortNVbyName implements Comparator<NhanVien>{

    @Override
    public int compare(NhanVien nhanVien1, NhanVien nhanVien2) {
        if(nhanVien1.getHoVaTen() == nhanVien2.getHoVaTen()){
            return 1;
        }
        return -1;
    }
    
}
