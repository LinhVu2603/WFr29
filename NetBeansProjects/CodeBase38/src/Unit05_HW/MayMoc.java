/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit05_HW;

/**
 *
 * @author Linh
 */
public class MayMoc {
    private String ten;
    private int namSX;
    private String nhaSX;
    private String nhienlieu;
    private int congSuat;
     public String getten() {
        return ten;
    }

    public void setten(String ten) {
        this.ten = ten;
    }

    public int getnamSX() {
        return namSX;
    }

    public void setnamSX(int namSX) {
        this.namSX = namSX;
    }

    public int getcongSuat() {
        return congSuat;
    }

    public void setcongSuat(int congSuat) {
        this.congSuat = congSuat;
    }

    public String getnhaSX() {
        return nhaSX;
    }

    public void setnhaSX(String nhaSX) {
        this.nhaSX = nhaSX;
    }

    public String getnhienLieu() {
        return nhienlieu;
    }

    public void setnhieuLieu(String nhienLieu) {
        this.nhienlieu = nhienLieu;
    }
    
}
