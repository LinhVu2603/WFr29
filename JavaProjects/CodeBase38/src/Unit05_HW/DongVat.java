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
public abstract class DongVat {

    private String ten;
    private int canNang;
    private int chieuCao;
    private String loai;
    private String thucAn;

    public String getten() {
        return ten;
    }

    public void setten(String ten) {
        this.ten = ten;
    }

    public int getcanNang() {
        return canNang;
    }

    public void setcanNang(int canNang) {
        this.canNang = canNang;
    }

    public int getchieuCao() {
        return chieuCao;
    }

    public void setchieuCao(int chieuCao) {
        this.chieuCao = chieuCao;
    }

    public String getloai() {
        return loai;
    }

    public void setloai(String loai) {
        this.loai = loai;
    }

    public String getthucAn() {
        return thucAn;
    }

    public void setthucAn(String thucAn) {
        this.thucAn = thucAn;
    }
    public abstract void sinhSan();

}
